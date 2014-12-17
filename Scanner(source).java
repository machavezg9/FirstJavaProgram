// I don't know entirely how to extract a value from a text file. The purpose of this code is to pull the 
// winning numbers from the latest lottery drawing.
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

// Use this to call out word utils
// import org.apache.commons.lang.WordUtils;
import static java.lang.System.out;

class ScanFile {
  public static void main(String args[]) throws IOException {
//
//    BufferedReader br = new BufferedReader(new FileReader("powerball.txt"));
//    String line;
//    while ((line = br.readLine()) != null) {
//      out.println(line);
//    }
//    br.close();
    Scanner scanner = new Scanner(new File("powerball.txt"));
    while (scanner.hasNextInt()) {
      int i = scanner.nextInt();
      out.println(i);
    }
//        
//    out.print("Here are your numbers!\n");
//    out.println(lower);
  }
}
