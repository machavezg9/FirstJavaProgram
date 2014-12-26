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
      String[] LotteryTypes = { "powerball", "mega millions", "super lotto", "fantasy 5", "daily 4", "daily 3", "daily derby"};
      Scanner lotteryScanner = new Scanner(System.in);
      DownloadResults aDownloadResults = new DownloadResults();
//The LotteryScanner class call out to pull the results for each lottery drawing
      LotteryScannerPB aLotteryScannerPB = new LotteryScannerPB();
      LotteryScannerMM aLotteryScannerMM = new LotteryScannerMM();
      LotteryScannerSL aLotteryScannerSL = new LotteryScannerSL();
      LotteryScannerF5 aLotteryScannerF5 = new LotteryScannerF5();
      LotteryScannerD4 aLotteryScannerD4 = new LotteryScannerD4();
      LotteryScannerD3 aLotteryScannerD3 = new LotteryScannerD3();
      String input, lower;
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
          out.println("Draw Date\t\tNum1\tNum2\tNum3\tNum4\tNum5\tPower");
          out.print(aLotteryScannerPB.date + ". " + aLotteryScannerPB.month + " ");
          out.print(aLotteryScannerPB.day + ", " + aLotteryScannerPB.year + "\t");
          out.print(aLotteryScannerPB.firNum + "\t" + aLotteryScannerPB.secNum + "\t");
          out.print(aLotteryScannerPB.thNum + "\t" + aLotteryScannerPB.forNum + "\t");
          out.println(aLotteryScannerPB.fifNum + "\t" + aLotteryScannerPB.power);
      }
      else if (lower.equals(LotteryTypes[1])) {
          out.println("The winning number for Mega Millions are:\n");
          out.println("Draw Date\t\tNum1\tNum2\tNum3\tNum4\tNum5\tPower");
          out.print(aLotteryScannerMM.date + ". " + aLotteryScannerMM.month + " ");
          out.print(aLotteryScannerMM.day + ", " + aLotteryScannerMM.year + "\t");
          out.print(aLotteryScannerMM.firNum + "\t" + aLotteryScannerMM.secNum + "\t");
          out.print(aLotteryScannerMM.thNum + "\t" + aLotteryScannerMM.forNum + "\t");
          out.println(aLotteryScannerMM.fifNum + "\t" + aLotteryScannerMM.mega);
      }
      else if (lower.equals(LotteryTypes[2])) {
          out.println("The winning number for Super Lotto are:\n");
          out.println("Draw Date\t\tNum1\tNum2\tNum3\tNum4\tNum5\tPower");
          out.print(aLotteryScannerSL.date + ". " + aLotteryScannerSL.month + " ");
          out.print(aLotteryScannerSL.day + ", " + aLotteryScannerSL.year + "\t");
          out.print(aLotteryScannerSL.firNum + "\t" + aLotteryScannerSL.secNum + "\t");
          out.print(aLotteryScannerSL.thNum + "\t" + aLotteryScannerSL.forNum + "\t");
          out.println(aLotteryScannerSL.fifNum + "\t" + aLotteryScannerSL.mega);
      }
      else if (lower.equals(LotteryTypes[3])) {
          out.println("The winning number for Fantasy 5 are:\n");
          out.println("Draw Date\t\tNum1\tNum2\tNum3\tNum4\tNum5");
          out.print(aLotteryScannerF5.date + ". " + aLotteryScannerF5.month + " ");
          out.print(aLotteryScannerF5.day + ", " + aLotteryScannerF5.year + "\t");
          out.print(aLotteryScannerF5.firNum + "\t" + aLotteryScannerF5.secNum + "\t");
          out.print(aLotteryScannerF5.thNum + "\t" + aLotteryScannerF5.forNum + "\t");
          out.println(aLotteryScannerF5.fifNum);
      }
      else if (lower.equals(LotteryTypes[4])) {
          out.println("The winning number for Daily 4 are:\n");
          out.println("Draw Date\t\tNum1\tNum2\tNum3\tNum4");
          out.print(aLotteryScannerD4.date + ". " + aLotteryScannerD4.month + " ");
          out.print(aLotteryScannerD4.day + ", " + aLotteryScannerD4.year + "\t");
          out.print(aLotteryScannerD4.firNum + "\t" + aLotteryScannerD4.secNum + "\t");
          out.println(aLotteryScannerD4.thNum + "\t" + aLotteryScannerD4.forNum);
      }
      else if (lower.equals(LotteryTypes[5])) {
          out.println("The winning number for Daily 3 are:\n");
          out.println("Draw Date\t\tNum1\tNum2\tNum3");
          out.print(aLotteryScannerD3.date + ". " + aLotteryScannerD3.month + " ");
          out.print(aLotteryScannerD3.day + ", " + aLotteryScannerD3.year + "\t");
          out.print(aLotteryScannerD3.firNum + "\t" + aLotteryScannerD3.secNum + "\t");
          out.println(aLotteryScannerD3.thNum);
      }
      else if (lower.equals(LotteryTypes[6])) {
          out.println("You Chose Daily Derby");
      }
    }
}
