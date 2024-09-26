import java.util.Scanner;
public class madLibs {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String madLib = new String ("I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.");
        int locationOne = madLib.indexOf("<"+1);    
        int locationTwo= secondOccurence(madLib, "<");
        int locationThree= thirdOccurence(madLib, "<");
        int endOne = madLib.indexOf(">");    
        int endTwo= secondOccurence(madLib, "<") -1;
        int endThree= thirdOccurence(madLib, "<") -1;

    }
    public String construct(String a, String b){
        String constructed= a+ " "+b;
        return constructed;
    }
    public static  int secondOccurence(String input, String search){
        int positioning = input.indexOf(search+1);
        String chunkTwo = input.substring(positioning);
        int occurrenceTwo = chunkTwo.indexOf(search);
        return occurrenceTwo;
    }
    public static  int thirdOccurence(String input, String search){
        int positioning = input.indexOf(search+1);
        String chunkTwo = input.substring(positioning);
        int occurrenceTwo = chunkTwo.indexOf(search);
        String chunkThree = input.substring(occurrenceTwo);
        int occurenceThree = chunkThree.indexOf(search);
        return occurenceThree;
    }

}
