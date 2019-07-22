import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.sound.midi.*;

public class MidiReader {
    private int NOTE_ON = 0x90;
    private int NOTE_OFF = 0x80;
    private String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "H"};
    private String path= "D:/!Projekte/MidiReaded/Output";
    private String inputPath= "src/Mid/STALKER Clear Sky - Bandit Radio.mid";
    private String fileName = inputPath.substring(0,inputPath.length()- 3) + "txt";

    public static void main(String[] args) throws Exception {
        MidiReader midiReader = new MidiReader();
        midiReader.run();
    }

    public void run() throws InvalidMidiDataException, IOException {
        Sequence sequence = MidiSystem.getSequence(new File(inputPath));
        MidiReader midiReader = new MidiReader();
        PrintStream fileOut = new PrintStream(fileName);
        System.setOut(fileOut);

        int trackNumber = 0;
        for (Track track : sequence.getTracks()) {
            trackNumber++;
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Track " + trackNumber + " size = " + track.size());
            System.out.println();
            for (int i = 0; i < track.size(); i++) {
                MidiEvent event = track.get(i);
                System.out.print("@" + event.getTick() + " ");
                MidiMessage message = event.getMessage();
                if (message instanceof ShortMessage) {
                    ShortMessage sm = (ShortMessage) message;
                    System.out.print("Channel: " + sm.getChannel() + " ");
                    if (sm.getCommand() == NOTE_ON) {
                        Notes notes = midiReader.getNoteOn(sm);
                        notes.getSynthNotes();
                    } else if (sm.getCommand() == NOTE_OFF) {
                        midiReader.getNoteOff(sm);
                    } else {
                        System.out.println("Command:" + sm.getCommand());
                    }
                } else {
                    message.getClass();
                }
            }
        }


    }

    public Notes getNoteOn(ShortMessage sm) {
        int key = sm.getData1();
        int octave = (key / 12) - 1;
        int note = key % 12;
        String noteName = NOTE_NAMES[note];
        int velocity = sm.getData2();
        String synthNotes=Notes.synthCalculator(noteName,octave);
        Notes noten = new Notes(key,octave,note,noteName,velocity,synthNotes);
        //if velocity !=0
        System.out.println(noten);

        return noten;
    }

    public void getNoteOff(ShortMessage sm) {
        int key = sm.getData1();
        int octave = (key / 12) - 1;
        int note = key % 12;
        String noteName = NOTE_NAMES[note];
        int velocity = sm.getData2();
        System.out.println("Note off, " + noteName + octave + " key=" + key + " velocity: " + velocity);

    }

    public void output(ShortMessage sm,String noteName,int octave, int key , int velocity){
        System.out.println("Note off, " + noteName + octave + " key=" + key + " velocity: " + velocity);
    }


}