/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;




class acaraTV{
        String StasiunTV;
        String Acara;
        String JamTayang;
        

        
        
        public String getStasiunTV(){
        
            return StasiunTV;
        }
        
        public void setStasiunTV(String StasiunTV){
        
            this.StasiunTV = StasiunTV;
        }
        
        public String getAcara(){
        
            return Acara;
        }
        
        public void setAcara(String Acara){
        
            this.Acara = Acara;
        }
        
        public void cetak(){
        
            System.out.println("Acara      :" + Acara );
            System.out.println("Channel    :" + StasiunTV);
            System.out.println("Jam Tayang :" + JamTayang);
        
        }
        
        public String getJamTayang(){
        
            return JamTayang;
        }
        
        public void setJamTayang(String JamTayang){
        
            this.JamTayang = JamTayang;
        }
        
    }


public class Tugas {
    static int menu_utama = 0, menu_pilihan=0;
    static String  nama, balik ="";
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner kembali = new Scanner (System.in);
        acaraTV a = new acaraTV();
                        
                            do{
                            System.out.println("");
                            System.out.print ("1.Trans TV |");  System.out.print("2.Indosiar  |");   System.out.println("3.RCTI        |");
                            System.out.print ("4.Trans 7  |");  System.out.print("5. TV One   |");   System.out.println("6.Global TV   |");
                            System.out.print ("7.MNC TV   |");  System.out.print("8. SCTV     |");   System.out.println("9.Metro TV    |");
                            System.out.print ("10.NET.TV  |");  System.out.println("11.Exit");
                            System.out.println("");
                            
                            System.out.print("Pilih Channel berapa? ");
                            menu_pilihan = scan.nextInt();
                            switch(menu_pilihan){
                                    case 1:
                                        do{
                                            a.StasiunTV = "Trans TV";
                                            a.Acara     = "Islam Itu Indah";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));    
                                        break;
                                    case 2:
                                        do{
                                            a.StasiunTV = "Indosiar";
                                            a.Acara     = "Indonesia Mencari Bakat";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                            
                                        break;
                                        case 3:
                                            do{
                                            a.StasiunTV = "RCTI";
                                            a.Acara     = "Dahsyat";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                        case 4:
                                            do{
                                            a.StasiunTV = "Trans 7";
                                            a.Acara     = "Opera Van Java";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                        case 5:
                                            do{
                                            a.StasiunTV = "TV One";
                                            a.Acara     = "Indonesia Lawyer Club";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                        case 6:
                                            do{
                                            a.StasiunTV = "Global TV";
                                            a.Acara     = "Spongebob Squerpants";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                        case 7:
                                            do{
                                            a.StasiunTV = "MNC TV";
                                            a.Acara     = "Ronaldowati";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                        case 8:
                                            do{
                                            a.StasiunTV = "SCTV";
                                            a.Acara     = "Tendangan Si Madun";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                        case 9:
                                            do{
                                            a.StasiunTV = "Metro TV";
                                            a.Acara     = "Selamat Sore Indonesia";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                           
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                        case 10:
                                            do{
                                            a.StasiunTV = "Net TV";
                                            a.Acara     = "Kelas Internasional";
                                            a.JamTayang = "16.00";
                                            System.out.println("");
                                            a.cetak();
                                            System.out.println("");
                                            System.out.print("Tekan Y untuk kembali Daftar Channel ");
                                            
                                            balik = kembali.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        break;
                                
                                }
                        
                        }while(menu_pilihan<11);
                            

                   
        
      
       
        
        
    }
      
}
        
        
        
                
        
     
        
        
        
        

    

