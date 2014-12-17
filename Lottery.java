/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel Chavez
 */
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import static java.lang.System.out;

class Lottery {
  public static void main(String args[]) throws IOException {
    String[] LotteryTypes = { "powerball", "mega millions", "super lotto", "fantasy 5", "daily 4", "daily 3", "daily derby", "hot spot"};
    Scanner lotteryScanner = new Scanner(System.in);
//The LotteryScanner class call out to pull the results for powerball
    LotteryScannerPB aLotteryScannerPB = new LotteryScannerPB();
    LotteryScannerMM aLotteryScannerMM = new LotteryScannerMM();
    String input, lower, newStr;
//StringBuilder is used to hold the value in memory of lower, in order to use it outside of the loop.
    StringBuilder sb = new StringBuilder();
//For now the sentence will be changed from "What lottery numbers do you want generated?"
//to "What winning numbers would you like to view?"
    out.print("What winning numbers would you like to view? ");
    input = lotteryScanner.nextLine();
    lower = input.toLowerCase();
    out.println();
// The line beneath was used to replace all of the if, else if, and else statements commented below.
// This line takes LotteryTypes then compares is by checking if the array contains the input.
    while (!Arrays.asList(LotteryTypes).contains(lower)) {
      out.print("Error please enter a valid Lottery request\n");
      out.print("What winning numbers would you like to view? ");
      input = lotteryScanner.nextLine();
      lower = input.toLowerCase();
      out.println();
// The code below is used to store the value of lower and use it outside the loop statement.
        sb.append(lower);
    }
    if (lower.equals(LotteryTypes[0])) {
        out.println("The winning number for Powerball are:\n");
        out.println("Num1\tNum2\tNum3\tNum4\tNum5\tPower");
        out.print(aLotteryScannerPB.firNum + "\t" + aLotteryScannerPB.secNum + "\t" + aLotteryScannerPB.thNum + "\t");
        out.println(aLotteryScannerPB.forNum + "\t" + aLotteryScannerPB.fifNum + "\t" + aLotteryScannerPB.power);
    }
    else if (lower.equals(LotteryTypes[1])) {
        out.println("The winning number for Mega Millions are:\n");
        out.println("Num1\tNum2\tNum3\tNum4\tNum5\tMega");
        out.print(aLotteryScannerMM.firNum + "\t" + aLotteryScannerMM.secNum + "\t" + aLotteryScannerMM.thNum + "\t");
        out.println(aLotteryScannerMM.forNum + "\t" + aLotteryScannerMM.fifNum + "\t" + aLotteryScannerMM.power);
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
  }
}
