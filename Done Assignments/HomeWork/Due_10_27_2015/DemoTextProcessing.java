import java.io.*;
import java.util.*;

public class DemoTextProcessing{
  public static void main(String args[]) { 
  
     Scanner words= new Scanner(System.in);
   //String texts = "I believe that if life gives you lemons, you should make lemonade And try to find somebody whose life has given them vodka, and have a party";
     System.out.println("Please Enter the text that you want to process");
    
     String texts = words.nextLine();
     System.out.println("Number of words are "+ TextProcessing.getWordsNumber(texts));
     System.out.println("Number of vowels are "+ TextProcessing.getVowelsNumber(texts));
     System.out.println("Printing the texts in reverse ");
      TextProcessing.displayBackwardString(texts);
 
 }
 }