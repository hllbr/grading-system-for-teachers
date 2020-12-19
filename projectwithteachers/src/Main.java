
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static String harfnotuHesapla(String isim,int vize1,int vize2,int finalnot,String ders){
    
        String cıktı = "";
        
        double toplamnot = (vize1*3/10.0)+(vize2*3/10.0)+(finalnot*4/10.0);
        if(toplamnot >= 90){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten AA aldı";
        }else if(toplamnot >=85){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten BA aldı";
        }else if(toplamnot >=80){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten BB aldı";
        }else if(toplamnot >=75){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten CB aldı";
        }else if(toplamnot >=70){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten CC aldı";
        }else if(toplamnot >=65){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten DC aldı";
        }else if(toplamnot >=60){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten DD aldı";
        }else if(toplamnot >=55){
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten DF aldı";
        }else{
            cıktı = isim + " adlı öğrenci "+ders+" adlı dersten FF aldı";           
          }return cıktı;
        }
    public static void main(String[] args) {  //Hem Okuma Hem yazma işlemi yapacağımız için try resource içerisinde 2 adet dosya işlemimiz olacak 
        try(Scanner scn = new Scanner(new FileReader("dosya.txt"));
                FileWriter writerfile = new FileWriter("Harfnotları.txt")){
            //okuma işlemi =
            while(scn.hasNextLine()){
                String ogrenciBilgileri = scn.nextLine();
                String [] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1 =Integer.valueOf(ogrenciArray[1]);
                int vize2 =Integer.valueOf(ogrenciArray[2]);
                int finalnot = Integer.valueOf(ogrenciArray[3]);
                
                String cıktı = harfnotuHesapla(ogrenciArray[0], vize1, vize2, finalnot, ogrenciArray[4]);
                writerfile.write(cıktı+"\n");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
      
    
    

