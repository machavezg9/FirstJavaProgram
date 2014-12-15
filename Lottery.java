import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

// Use this to call out word utils
// import org.apache.commons.lang.WordUtils;
import static java.lang.System.out;

class Lottery {
  public static void main(String args[]) throws IOException {
    String[] LotteryTypes = { "powerball", "mega millions", "super lotto", "fantasy 5", "daily 4", "daily 3", "daily derby", "hot spot"};
    Scanner lotteryScanner = new Scanner(System.in);
    String input, lower, newStr;
    StringBuilder sb = new StringBuilder();
//    out.println(LotteryTypes[0-1]);
    out.print("What lottery numbers do you want generated? ");
    input = lotteryScanner.nextLine();
    lower = input.toLowerCase();
    // The line beneath was used to replace all of the if, else if, and else statements commented below.
    // This line takes LotteryTypes then compares is by checking if the array contains the input.
    while (!Arrays.asList(LotteryTypes).contains(lower)) {
      out.print("Error please enter a valid Lottery request\n");
      out.print("What lottery numbers do you want generated? ");
      input = lotteryScanner.nextLine();
      lower = input.toLowerCase();
        // The code below is used to store the value of lower and use it outside the loop statement.
        sb.append(lower);
    }
//    if (Arrays.asList(LotteryTypes[0]).contains(lower)) {
//      String lottery = LotteryTypes[0];
//      out.println(lottery);
//    }
    if (lower.equals(LotteryTypes[0])) {
      out.print("You Chose Powerball");
    }
    else if (lower.equals(LotteryTypes[1])) {
//     out.println(Arrays.toString(Arrays.copyOfRange(LotteryTypes, 1, 8)));
     out.println("You Chose Mega Millions");
     // out.print(Arrays.toString(newAr));
    }
    else if (lower.equals(LotteryTypes[2])) {
     out.println("You Chose Super Lotto");
    }
    else if (lower.equals(LotteryTypes[3])) {
     out.println("You Chose Fantasy 5");
    }
    else if (lower.equals(LotteryTypes[4])) {
     out.println("You Chose Daily 4");
    }
    else if (lower.equals(LotteryTypes[5])) {
     out.println("You Chose Daily 3");
    }
    else if (lower.equals(LotteryTypes[6])) {
     out.println("You Chose Daily Derby");
    }
    else {
     out.println("You Chose Hot Spot");
    }
//    BufferedReader br = new BufferedReader(new FileReader("powerball.txt"));
//    String line;
//    while ((line = br.readLine()) != null) {
//      out.println(line);
//    }
//    br.close();
//        
//    out.print("Here are your numbers!\n");
//    out.println(lower);
  }
}
