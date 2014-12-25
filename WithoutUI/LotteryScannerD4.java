/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author darthmaul
 */
class LotteryScannerD4 {        
        String date = "", month = "";
        int draw, day, year, firNum, secNum, thNum, forNum;
        public LotteryScannerD4() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("daily4.txt"));
            // Used to skip the first 5 lines of unnecessary text
            for (int i = 1; i <= 5; i++){
                br.readLine();
            }
            String line = br.readLine();
                String tmp[] = line.split("[ ., ]+");
                draw = Integer.parseInt(tmp[0]);
                date = tmp[1]; 
                month = tmp[2]; 
                day = Integer.parseInt(tmp[3]);
                year = Integer.parseInt(tmp[4]);
                firNum = Integer.parseInt(tmp[5]); secNum = Integer.parseInt(tmp[6]); 
                thNum = Integer.parseInt(tmp[7]); forNum = Integer.parseInt(tmp[8]);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
