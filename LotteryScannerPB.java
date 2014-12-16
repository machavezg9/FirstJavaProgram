/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author darthmaul
 */
public class LotteryScanner {

    public static void main(String[] args) {
        
        String date = "", month = "";
        int draw = 0, day = 0, year = 0, firNum = 0, secNum = 0, thNum = 0, forNum = 0, fifNum = 0, power = 0;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Name.txt"));
            String line = br.readLine();
            
            //While needs to be removed and line needs to be defined above to read only the first line
            while ((line = br.readLine()) != null) {
                String tmp[] = line.split("[ ., ]+");
                draw = Integer.parseInt(tmp[0]);
                date = tmp[1]; month = tmp[2]; 
                day = Integer.parseInt(tmp[3]);
                year = Integer.parseInt(tmp[4]);
                firNum = Integer.parseInt(tmp[5]); secNum = Integer.parseInt(tmp[6]); thNum = Integer.parseInt(tmp[7]);
                forNum = Integer.parseInt(tmp[8]); fifNum = Integer.parseInt(tmp[9]); power = Integer.parseInt(tmp[10]);
                //Have to try a loop to output the winning number, defining each one can't be a solution.        
                //for (int i = 5; i < 8; i++) {
                //    nums = Integer.parseInt(tmp[i]);
                //}
                
                System.out.print(draw + "\t" + date + ".\t" + month + "\t" + day + ",\t" + year + "\t" + firNum);
                System.out.println("\t" + secNum + "\t" + thNum + "\t" + forNum + "\t" + fifNum + "\t" + power);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
