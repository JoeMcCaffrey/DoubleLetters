
import java.util.Scanner;
import java.lang.Character;


public class DoubleLetters {
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    String doubled = "";
    char ex = '!';
    for(int i = 0 ; i < input.length() ; i++ ){
      char c = input.charAt(i);
      //if the character is not a valid letter
        if(Character.isLetter(c) != true){
          // if this is an ! triple it
          if(c == ex){
            doubled = doubled +c+c+c;
          }
          // if its not a valid letter then just add it to the string
          else{
            doubled = doubled + c;
          }
        }
        // its a valid letter double it
        else{ 
          doubled = doubled + c + c;
        }
      
    }
    // print out result
    System.out.println(doubled);
  }
}
