import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
import java.io.IOException;
// Use this to call out word utils
// import org.apache.commons.lang.WordUtils;
import static java.lang.System.out;

class Lottery {
  public static void main(String args[]) throws IOException {
    String [] LotteryTypes = { "powerball", "mega millions", "super lotto", "fantasy 5", "daily 4", "daily 3", "daily derby", "hot spot"};
    Scanner lotteryScanner = new Scanner(System.in);
    String input1, input2, lower1, lower2;
//    out.println(LotteryTypes[0-1]);
    out.print("What lottery numbers do you want generated?: ");
    input1 = lotteryScanner.nextLine();
    lower1 = input1.toLowerCase();
    // The line beneath was used to replace all of the if, else if, and else statements commented below.
    // This line takes LotteryTypes then compares is by checking if the array contains the input.
    if (!Arrays.asList(LotteryTypes).contains(lower1)) {
// This code is used to capitalize but wont work with DrJava
//      WordUtils.capitalize("You chose");
      out.print("Please pick from Powerball, MegaMillions, Super Lotto, Fantasy 5, Daily 4, Daily 3, Daily Derby or Hot Spot: ");
      input2 = lotteryScanner.nextLine();
      lower2 = input2.toLowerCase();
      
      if (Arrays.asList(LotteryTypes).contains(lower2)){
        out.println("Thank You For Playing");
      }
    }
// I could've used tons of if or else if statements and end up with a large code.
//    if (lower.equals(LotteryTypes[0])) {
//      out.println(input);
//    }
//    else if (lower.equals(LotteryTypes[1])) {
//      out.println(input);
//    }
//    else if (lower.equals(LotteryTypes[2])) {
//      out.println(input);
//    }
//    else if (lower.equals(LotteryTypes[3])) {
//      out.println(input);
//    }
//    else if (lower.equals(LotteryTypes[4])) {
//      out.println(input);
//    }
//    else if (lower.equals(LotteryTypes[5])) {
//      out.println(input);
//    }
//    else if (lower.equals(LotteryTypes[6])) {
//      out.println(input);
//    }
//    else if (lower.equals(LotteryTypes[7])) {
//      out.println(input);
//    }
//    else {
//      out.println("Invalid Input");
//    }
  }
}
//              
//    out.print(LotteryTypes[0]);
//    out.println();
//    
