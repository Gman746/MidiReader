public class Notes {
    private static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "H"};
    private int key = 0;
    private int octave = (key / 12) - 1;
    private int note = key % 12;
    private String noteName = NOTE_NAMES[note];
    private int velocity = 66;
    private String synthNotes = null;

    public Notes(int key, int octave, int note, String noteName, int velocity,String synthNotes) {
        this.key = key;
        this.octave = octave;
        this.note = note;
        this.noteName = noteName;
        this.velocity = velocity;
        this.synthNotes = synthNotes;
    }

    @Override
    public String toString() {
        if (velocity > 0) {
            return "Notes{" +
                    " octave=" + octave +
                    ", noteName='" + noteName + '\'' +
                    ", velocity=" + velocity +
                    ", synthNotes='" + synthNotes + '\'' +
                    '}';
        }
        else {
           return null;
        }
    }


    public String getSynthNotes() {
        return synthNotes;
    }

    public static String synthCalculator(String noteName, int octave){
        String synthNotes= null;
        if (noteName.equals("C")&&octave ==0){
            synthNotes = "4 [0]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==0){
            synthNotes = "5 [0]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==0){
            synthNotes = "6 [0]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==0){
            synthNotes = "7 [0]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==0){
            synthNotes = "8 [0]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==0){
            synthNotes = "9 [0]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==0){
            synthNotes = "10 [0]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==0){
            synthNotes = "11 [0]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==0){
            synthNotes = "12 [0]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==0){
            synthNotes = "13 [0]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==0){
            synthNotes = "14 [0]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==0){
            synthNotes = "15 +- 0";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==1){
            synthNotes = "4 [1]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==1){
            synthNotes = "5 [1]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==1){
            synthNotes = "6 [1]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==1){
            synthNotes = "7 [1]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==1){
            synthNotes = "8 [1]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==1){
            synthNotes = "9 [1]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==1){
            synthNotes = "10 [1]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==1){
            synthNotes = "11 [1]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==1){
            synthNotes = "12 [1]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==1){
            synthNotes = "13 [1]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==1){
            synthNotes = "14 [1]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==1){
            synthNotes = "15 [1]";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==2){
            synthNotes = "4 [2]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==2){
            synthNotes = "5 [2]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==2){
            synthNotes = "6 [2]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==2){
            synthNotes = "7 [2]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==2){
            synthNotes = "8 [2]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==2){
            synthNotes = "9 [2]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==2){
            synthNotes = "10 [2]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==2){
            synthNotes = "11 [2]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==2){
            synthNotes = "12 [2]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==2){
            synthNotes = "13 [2]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==2){
            synthNotes = "14 [2]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==2){
            synthNotes = "15 [2]";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==3){
            synthNotes = "4 [3]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==3){
            synthNotes = "5 [3]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==3){
            synthNotes = "6 [3]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==3){
            synthNotes = "7 [3]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==3){
            synthNotes = "8 [3]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==3){
            synthNotes = "9 [3]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==3){
            synthNotes = "10 [3]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==3){
            synthNotes = "11 [3]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==3){
            synthNotes = "12 [3]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==3){
            synthNotes = "13 [3]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==3){
            synthNotes = "14 [3]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==3){
            synthNotes = "15 [3]";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==4){
            synthNotes = "4 [4]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==4){
            synthNotes = "5 [4]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==4){
            synthNotes = "6 [4]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==4){
            synthNotes = "7 [4]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==4){
            synthNotes = "8 [4]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==4){
            synthNotes = "9 [4]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==4){
            synthNotes = "10 [4]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==4){
            synthNotes = "11 [4]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==4){
            synthNotes = "12 [4]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==4){
            synthNotes = "13 [4]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==4){
            synthNotes = "14 [4]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==4){
            synthNotes = "15 [4]";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==5){
            synthNotes = "4 [5]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==5){
            synthNotes = "5 [5]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==5){
            synthNotes = "6 [5]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==5){
            synthNotes = "7 [5]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==5){
            synthNotes = "8 [5]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==5){
            synthNotes = "9 [5]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==5){
            synthNotes = "10 [5]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==5){
            synthNotes = "11 [5]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==5){
            synthNotes = "12 [5]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==5){
            synthNotes = "13 [5]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==5){
            synthNotes = "14 [5]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==5){
            synthNotes = "15 [5]";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==6){
            synthNotes = "4 [6]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==6){
            synthNotes = "5 [6]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==6){
            synthNotes = "6 [6]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==6){
            synthNotes = "7 [6]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==6){
            synthNotes = "8 [6]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==6){
            synthNotes = "9 [6]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==6){
            synthNotes = "10 [6]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==6){
            synthNotes = "11 [6]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==6){
            synthNotes = "12 [6]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==6){
            synthNotes = "13 [6]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==6){
            synthNotes = "14 [6]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==6){
            synthNotes = "15 [6]";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==7){
            synthNotes = "4 [7]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==7){
            synthNotes = "5 [7]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==7){
            synthNotes = "6 [7]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==7){
            synthNotes = "7 [7]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==7){
            synthNotes = "8 [7]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==7){
            synthNotes = "9 [7]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==7){
            synthNotes = "10 [7]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==7){
            synthNotes = "11 [7]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==7){
            synthNotes = "12 [7]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==7){
            synthNotes = "13 [7]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==7){
            synthNotes = "14 [7]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==7){
            synthNotes = "15 [7]";
            return synthNotes;
        }
        else if (noteName.equals("C")&&octave ==8){
            synthNotes = "4 [8]";
            return synthNotes;
        }
        else if(noteName.equals("C#")&&octave ==8){
            synthNotes = "5 [8]";
            return synthNotes;
        }
        else if(noteName.equals("D")&&octave ==8){
            synthNotes = "6 [8]";
            return synthNotes;
        }
        else if(noteName.equals("D#")&&octave ==8){
            synthNotes = "7 [8]";
            return synthNotes;
        }
        else if(noteName.equals("E")&&octave ==8){
            synthNotes = "8 [8]";
            return synthNotes;
        }
        else if(noteName.equals("F")&&octave ==8){
            synthNotes = "9 [8]";
            return synthNotes;
        }
        else if(noteName.equals("F#")&&octave ==8){
            synthNotes = "10 [8]";
            return synthNotes;
        }
        else if(noteName.equals("G")&&octave ==8){
            synthNotes = "11 [8]";
            return synthNotes;
        }
        else if(noteName.equals("G#")&&octave ==8){
            synthNotes = "12 [8]";
            return synthNotes;
        }
        else if(noteName.equals("A")&&octave ==8){
            synthNotes = "13 [8]";
            return synthNotes;
        }
        else if(noteName.equals("A#")&&octave ==8){
            synthNotes = "14 [8]";
            return synthNotes;
        }
        else if(noteName.equals("H")&&octave ==8){
            synthNotes = "15 [8]";
            return synthNotes;
        }
        else {
            synthNotes = "Out of Range";
            return synthNotes;
        }
    }
}
