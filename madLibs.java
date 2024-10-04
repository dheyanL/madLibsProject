import java.util.Scanner;
public class madLibs {
    public static void main(String[] args) {

       String madLib = new String ("I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.");
       String madLibTwo = new String ("Once upon a time in a <adjective> land, a <noun> <adverb> grew.");
       String madLibThree = new String ("When I was a boy I went to the <noun> to <verb> with <proper_noun>");
       double selection = 3*Math.random();
       boolean randomSwitch = false;
     
        construct(madLib);
        construct(madLibTwo);
        construct(madLibThree);
    
    }


    public static void construct(String madLib){
       Scanner sc = new Scanner (System.in);

        int locationOne = madLib.indexOf("<")+1;    
        int locationTwo= secondOccurence(madLib, "<")+1;
        int locationThree= thirdOccurence(madLib, "<")+1;
        int endOne = madLib.indexOf(">"); 
        int endTwo= secondOccurence(madLib, ">") ;
        int endThree= thirdOccurence(madLib, ">") ;
        String partOfSpeechOne = new String(madLib.substring(locationOne, endOne));
        String partOfSpeechTwo = new String(madLib.substring(locationTwo, endTwo));
        
        String partOfSpeechThree = new String(madLib.substring(locationThree, endThree));
        System.out.println("Enter a "+ partOfSpeechOne);
        String inputOne= sc.nextLine();
        System.out.println("Enter a "+ partOfSpeechTwo);
        String inputTwo= sc.nextLine();
        System.out.println("Enter a "+ partOfSpeechThree);
        String inputThree= sc.nextLine();
        System.out.println(madLib.substring(0,locationOne-1)+ inputOne+ madLib.substring(endOne+1, locationTwo-1)+ inputTwo+ madLib.substring(endTwo+1, locationThree-1)+ inputThree+madLib.substring(endThree+1, madLib.length()));
    }
    
    public static  int secondOccurence(String input, String search){
        int positioning = input.indexOf(search)+1;
        String chunkTwo = input.substring(positioning);
        int occurrenceTwo = positioning+chunkTwo.indexOf(search);
        return occurrenceTwo;
    }
    public static  int thirdOccurence(String input, String search)
    {
        int positioning = input.indexOf(search)+1;
        String chunkTwo = input.substring(positioning);
        int occurrenceTwo = positioning+chunkTwo.indexOf(search)+1;
        String chunkThree = input.substring(occurrenceTwo);
        int occurenceThree = secondOccurence(input, search)+1+chunkThree.indexOf(search);
        return occurenceThree;
    }

}
