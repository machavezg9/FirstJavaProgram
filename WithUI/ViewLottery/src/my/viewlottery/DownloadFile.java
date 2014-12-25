/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.viewlottery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darthmaul
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class DownloadFile {
//    public static void main(String[] args) throws IOException {
    public DownloadFile() throws IOException {
        String filePB = "//tmp//powerball.txt"; //The file that will be saved on your computer
        URL linkPB = new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=powerball"); //The file that you want to download
        
        String fileMM = "//tmp//megamillions.txt"; //The file that will be saved on your computer
        URL linkMM = new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=mega-millions"); //The file that you want to download
        
        String fileSL = "//tmp//superlotto.txt"; //The file that will be saved on your computer
        URL linkSL = new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=superlotto-plus"); //The file that you want to download
        
        String fileF5 = "//tmp//fantasy5.txt"; //The file that will be saved on your computer
        URL linkF5 = new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=fantasy-5"); //The file that you want to download
        
        String fileD4 = "//tmp//daily4.txt"; //The file that will be saved on your computer
        URL linkD4 = new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=daily-4"); //The file that you want to download

        String fileD3 = "//tmp//daily3.txt"; //The file that will be saved on your computer
        URL linkD3 = new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=daily-3"); //The file that you want to download

//Power Ball
        InputStream inPB = new BufferedInputStream(linkPB.openStream());
        ByteArrayOutputStream outPB = new ByteArrayOutputStream();
//Mega Millions
        InputStream inMM = new BufferedInputStream(linkMM.openStream());
        ByteArrayOutputStream outMM = new ByteArrayOutputStream();
//Super Lotto
        InputStream inSL = new BufferedInputStream(linkSL.openStream());
        ByteArrayOutputStream outSL = new ByteArrayOutputStream();
//Fantasy 5
        InputStream inF5 = new BufferedInputStream(linkF5.openStream());
        ByteArrayOutputStream outF5 = new ByteArrayOutputStream();
//Daily 4
        InputStream inD4 = new BufferedInputStream(linkD4.openStream());
        ByteArrayOutputStream outD4 = new ByteArrayOutputStream();
//Daily 3
        InputStream inD3 = new BufferedInputStream(linkD3.openStream());
        ByteArrayOutputStream outD3 = new ByteArrayOutputStream();
        
        byte[] buf = new byte[1024];
	int n = 0;
//Powerball
        while (-1!=(n=inPB.read(buf)))
	{
            outPB.write(buf, 0, n);
        }
	outPB.close();
        inPB.close();
        byte[] responsePB = outPB.toByteArray();
	
        FileOutputStream fosPB = new FileOutputStream(filePB);
        fosPB.write(responsePB);
        fosPB.close();
//Mega Millions
        while (-1!=(n=inMM.read(buf)))
	{
            outMM.write(buf, 0, n);
        }
	outMM.close();
        inMM.close();
        byte[] responseMM = outMM.toByteArray();
        FileOutputStream fosMM = new FileOutputStream(fileMM);
        fosMM.write(responseMM);
        fosMM.close();
//Super Lotto
        while (-1!=(n=inSL.read(buf)))
	{
            outSL.write(buf, 0, n);
        }
	outSL.close();
        inSL.close();
        byte[] responseSL = outSL.toByteArray();
        
        FileOutputStream fosSL = new FileOutputStream(fileSL);
        fosSL.write(responseSL);
        fosSL.close();
//Fantasy 5
        while (-1!=(n=inF5.read(buf)))
	{
            outF5.write(buf, 0, n);
        }
	outF5.close();
        inF5.close();
        byte[] responseF5 = outF5.toByteArray();
        
        FileOutputStream fosF5 = new FileOutputStream(fileF5);
        fosF5.write(responseF5);
        fosF5.close();
//Daily 4
        while (-1!=(n=inD4.read(buf)))
	{
            outD4.write(buf, 0, n);
        }
	outD4.close();
        inD4.close();
        byte[] responseD4 = outD4.toByteArray();
        
        FileOutputStream fosD4 = new FileOutputStream(fileD4);
        fosD4.write(responseD4);
        fosD4.close();
//Daily 3
        while (-1!=(n=inD3.read(buf)))
	{
            outD3.write(buf, 0, n);
        }
	outD3.close();
        inD3.close();
        byte[] responseD3 = outD3.toByteArray();
        
        FileOutputStream fosD3 = new FileOutputStream(fileD3);
        fosD3.write(responseD3);
        fosD3.close();
    }
}

