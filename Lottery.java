import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
import static java.lang.System.out;

class Lottery {
  public static void main(String args[]) {
    String [] LotteryTypes = { "Powerball", "Super Lotto" };
    Scanner lotteryScanner = new Scanner(System.in);
    String input;
//    out.println(LotteryTypes[0]);
    out.print("What lottery numbers do you want generated?: ");
    input = lotteryScanner.nextLine();
    
    if (input.equals(LotteryTypes[0]) || input.equals(LotteryTypes[1])) {
      out.println(input);
    }
    else {
      out.println("Invalid Input");
    }
  }
}
//              
//    out.print(LotteryTypes[0]);
//    out.println();
//   
