import java.util.Scanner;
public class Conversation {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    String[] canned_responses = new String[] {"Uh huh", "That's interesting", "Wow"}; 
    

    System.out.println("How many rounds? ");
    int rounds = userInput.nextInt();
    userInput.nextLine();
    System.out.println("Hi there! Whats on your mind? ");

for(int i = 0; i < rounds; i++) {
      String answer = userInput.nextLine();
      String response = answer;

      if (answer.contains("I")) {
        response=(response.replace("I", "you"));}
      if (answer.contains("me")) {
        response=(response.replace("me", "you"));}
      if (answer.contains("your")){ 
        response=(response.replace("your", "my"));} 
      if (answer.contains("am")) {
        response=(response.replace("am", "are"));}
      if (answer.contains("are")) {
          response=(response.replace("are", "am"));}
      if (answer.contains("you")){ 
        response=(response.replace("you", "I"));}
      if (answer.contains("You")){
        response=(response.replace("You", "I")) ;}
      if (answer.contains("my")){ 
          response=(response.replace("my", "your"));}
        
      else { 
        response = "Uh huh.";
      }
    System.out.println(response);
    }
    userInput.close();
  }
}



// need a array list for the transcript.
