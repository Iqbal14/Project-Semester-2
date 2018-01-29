package projectuts;


import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
public class Projectuts {
public void Menu(){
    
    System.out.println("|=============================================================|");
    System.out.println("|                         HOTEL ANTARIKSA                     |");
    System.out.println("|=============================================================|");
    System.out.println("|     1. Tipe Kamar Hotel                                     |");
    System.out.println("|     2. Transaksi Penjualan                                  |");
    System.out.println("|     3. Omset perhari                                        |");
    System.out.println("|     4. Help                                                 |");
    System.out.println("|     5. Exit                                                 |");
    System.out.println("|=============================================================|");
     }

 public void cover(){
    System.out.println("=============================================================");
    System.out.println("                         HOTEL ANTARIKSA                     ");
    System.out.println("=============================================================");
    }
 public void Tipe_Hotel(){
    
    System.out.println("1. Standart Room  (STD)  = Rp.150.000");
    System.out.println("2. Superior Room  (SUP)  = Rp.530.000");
    System.out.println("3. Deluxe Room    (DLX)  = Rp.375.000");
    System.out.println("4. Suite  Room    (STE)  = Rp.450.000");
    System.out.println("5. Penthouse Room (PTH)  = Rp.650.000");
    
 
 }
    
    
    
    
    
    public static void main(String[] args) {

    Scanner adhitya = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        BufferedReader ins;//penamaan untuk ins sebagai sebuah pembaca pada program
        BufferedWriter outs;//penamaan untuk outs sebagai pengganti SOP
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read;//penamaan variabel read pada display transaksi
        int i = 0;
        int menu_utama = 0;
        int menu_2;
        int menu = 0;
        int pil_kamar=0;
        // penamaan variabel untuk omset
        int tipek_1;
        int tipek_2;
        int tipek_3;
        int tipek_4;
        int tipek_5;
        int harga_1;
        int harga_2;
        int harga_3;
        int harga_4;
        int harga_5;
        int omset;
        int total;
        
        String menu1[] = new String[100];
        int harga[] = new int [100];
        String balik ="Y";
        String user1, password1 = null, user, password;
        Projectuts mn = new Projectuts();
        //kapasitas kamar di hotel
        int kap_tipek1 = 6;
        int kap_tipek2 = 10;
        int kap_tipek3 = 8;
        int kap_tipek4 = 5;
        int kap_tipek5 = 5;
        
        
        //data untuk login
        user1 = "admin";
        password1= "admin123";
        int kes=3;
        int log=0;
        
       
    do{
     
        do {//login            
        System.out.print("masukkan Username: ");
        user = adhitya.nextLine() ;
        System.out.print("masukkan Password: ");
        password = adhitya.nextLine();
        if (user1.equals(user) && password1.equals(password)){
            System.out.println("login berhasil");
            log=1;
        }else{
            kes=kes-1;
            if (kes==0) {
                System.out.println("kesempatan habis");
                System.exit(0);
            } else {
                System.out.println("kesematan anda login kurang dari "+kes);
                log=0;
            }
        }
        } while (log==0);
 
        do{
            
                mn.Menu();
                System.out.print("Masukkan Pilihan Anda :");
                menu_utama = adhitya.nextInt();
                switch(menu_utama){
                    case 1:
                        
                        do{
                        mn.cover();
                        System.out.println("HOTEL ANTARIKSA");
                        System.out.println("");
                        String tujuan[] = new String[5];
                        tujuan[0] = "1. Standart Room  (STD)";
                        tujuan[1] = "2. Superior Room  (SUP)";
                        tujuan[2] = "3. Deluxe Room    (DLX)";
                        tujuan[3] = "4. Suite  Room    (STE)";
                        tujuan[4] = "5. Penthouse Room (PTH)";
                        System.out.println(tujuan[0]);
                        System.out.println(tujuan[1]);
                        System.out.println(tujuan[2]);
                        System.out.println(tujuan[3]);
                  
                        System.out.println(tujuan[4]);
                        System.out.println("");
                        System.out.print("Apakah Anda Ingin Kembali Ke Menu? (Y/N) : ");
                        balik = scan.nextLine();
                       
                        }while(balik.equalsIgnoreCase("n"));  
                        break;
                        
                        
                    case 2:
                        
                        do{
                        mn.cover();
                        System.out.println("");
                        System.out.println("1. Input transaksi");
                        System.out.println("2. Display transaksi");
                        System.out.println("3. Exit");
                        System.out.println("");
                        System.out.print("Masukkan pilihan anda :");
                        menu_2 = adhitya.nextInt();
                            
                                switch(menu_2){
                                    case 1:
                                        
                                     do{
                                            
                                                        mn.cover();
                                                        System.out.println("Hotel Antariksa");
                                                        System.out.println("1. Standart Room  (STD)  = Rp.150.000 ");
                                                        System.out.println("2. Superior Room  (SUP)  = Rp.530.000 ");
                                                        System.out.println("3. Deluxe Room    (DLX)  = Rp.375.000 ");
                                                        System.out.println("4. Suite  Room    (STE)  = Rp.450.000 ");
                                                        System.out.println("5. Penthouse Room (PTH)  = Rp.650.000 ");
                                                        {
                                                        System.out.print("pilihan kamar anda = ");
                                                            int pil = adhitya.nextInt();
                                                            if(pil==1)
                                                            {
                                                                menu1[i] = "1. Standart Room  (STD)  = Rp.150.000 ";
                                                                harga[i] = 150000;
                                                                System.out.print("Memesan Berapa Kamar :");
                                                                pil_kamar = adhitya.nextInt();
                                                                kap_tipek1 = kap_tipek1-pil;
                                                                total = harga[i] * pil_kamar;
                                                                System.out.println("Harga Total: "+total);
                                                                                            try{
                                                                                            outs = new BufferedWriter(new FileWriter("Pesanan Kamar.txt",true));
                                                                                            outs.write("4. Suite  Room (STE). Memesan" + pil_kamar  + " Kamar " + " . Total harganya Rp ." + total );
                                                                                            outs.newLine();
                                                                                            outs.close();
                                                                                            }catch(IOException e){
                                                                                            System.out.println("There was a problem found: " + e);}
                                                                if (kap_tipek1==0)
                                                                {
                                                                System.out.println("Sisa Kapasitas kamar telah habis");
                                                                System.out.print("Kembali ke daftar hotel(Y/N) :");
                                                                balik = scan.nextLine();
                                                                
                                                                }else{
                                                                System.out.println("Sisa kapasitas kamar yang tersedia :"+kap_tipek1);                                                               
                                                                System.out.print("Kembali ke daftar hotel (Y/N)");
                                                                balik = scan.nextLine();
                                                                log=0;
                                                                }
                                                                
                                                            }else if(pil==2)
                                                            {
                                                                menu1[i] = "2. Superior Room  (SUP)  = Rp.530.000 ";
                                                                harga[i] = 530000;
                                                                System.out.print("Memesan Berapa Kamar :");
                                                                pil_kamar = adhitya.nextInt();
                                                                kap_tipek2 = kap_tipek2-pil;
                                                                total = harga[i] * pil_kamar;
                                                                System.out.println("Harga Total: "+total);
                                                                                            try{
                                                                                            outs = new BufferedWriter(new FileWriter("Pesanan Kamar.txt",true));
                                                                                            outs.write("4. Suite  Room (STE). Memesan" + pil_kamar  + " Kamar " + " . Total harganya Rp ." + total );
                                                                                            outs.newLine();
                                                                                            outs.close();
                                                                                            }catch(IOException e){
                                                                                            System.out.println("There was a problem found: " + e);}
                                                                if (kap_tipek2==0)
                                                                {
                                                                System.out.println("Kapasitas kamar telah habis");
                                                                System.out.println("Kembali ke daftar hotel(Y/N) :");
                                                                balik = scan.nextLine();
                                                                
                                                                }else{
                                                                System.out.println("Sisa kapasitas kamar yang tersedia :"+kap_tipek2);
                                                                System.out.println("Kembali ke daftar hotel (Y/N)");
                                                                balik = scan.nextLine();
                                                                log=0;
                                                                }
                                                                
                                                                
                                                            }else if(pil==3)
                                                            {
                                                                menu1[i] = "3. Deluxe Room    (DLX)  = Rp.375.000 ";
                                                                harga[i] = 375000;
                                                                System.out.print("Memesan Berapa Kamar :");
                                                                pil_kamar = adhitya.nextInt();
                                                                kap_tipek3 = kap_tipek3-pil_kamar;
                                                                total = harga[i] * pil_kamar;
                                                                System.out.println("Harga Total: "+total);
                                                                                            try{
                                                                                            outs = new BufferedWriter(new FileWriter("Pesanan Kamar.txt",true));
                                                                                            outs.write("4. Suite  Room (STE). Memesan" + pil_kamar  + " Kamar " + " . Total harganya Rp ." + total );
                                                                                            outs.newLine();
                                                                                            outs.close();
                                                                                            }catch(IOException e){
                                                                                            System.out.println("There was a problem found: " + e);}
                                                                if (kap_tipek3==0)
                                                                {
                                                                System.out.println("Kapasitas kamar telah habis");
                                                                System.out.println("Kembali ke daftar hotel(Y/N) :");
                                                                balik = scan.nextLine();
                                                                
                                                                }else{
                                                                System.out.println("Sisa kapasitas kamar yang tersedia :"+kap_tipek3);
                                                                System.out.println("Kembali ke daftar hotel (Y/N)");
                                                                balik = scan.nextLine();
                                                                log=0;
                                                                }
                                                            }else if(pil==4)
                                                            {
                                                                menu1[i] = "4. Suite  Room    (STE)  = Rp.450.000 ";
                                                                harga[i] = 450000;
                                                                System.out.print("Memesan Berapa Kamar :");
                                                                pil_kamar = adhitya.nextInt();
                                                                kap_tipek4 = kap_tipek4-pil_kamar;
                                                                total = harga[i] * pil_kamar;
                                                                System.out.println("Harga Total: "+total);
                                                                                            try{
                                                                                            outs = new BufferedWriter(new FileWriter("Pesanan Kamar.txt",true));
                                                                                            outs.write("4. Suite  Room (STE). Memesan" + pil_kamar  + " Kamar " + " . Total harganya Rp ." + total );
                                                                                            outs.newLine();
                                                                                            outs.close();
                                                                                            }catch(IOException e){
                                                                                            System.out.println("There was a problem found: " + e);}
                                                                if (kap_tipek4==0)
                                                                {
                                                                System.out.println("Kapasitas kamar telah habis");
                                                                System.out.println("Kembali ke daftar hotel(Y/N) :");
                                                                balik = scan.nextLine();
                                                                
                                                                }else{
                                                                System.out.println("Sisa kapasitas kamar yang tersedia :"+kap_tipek4);
                                                                System.out.println("Kembali ke daftar hotel (Y/N)");
                                                                balik = scan.nextLine();
                                                                log=0;
                                                                }
                                                            }else if(pil==5)
                                                            {
                                                                menu1[i] = "5. Penthouse Room (PTH)  = Rp.650.000 ";
                                                                harga[i] = 650000;                                                                
                                                                System.out.print("Memesan Berapa Kamar :");
                                                                pil_kamar = adhitya.nextInt();
                                                                total = harga[i] * pil_kamar;
                                                                System.out.println("Harga Total: "+total);
                                                                kap_tipek5 = kap_tipek5-pil;
                                                                                            try{
                                                                                            outs = new BufferedWriter(new FileWriter("Pesanan Kamar.txt",true));
                                                                                            outs.write("5. Penthouse Room (PTH). Memesan" + pil_kamar  + " Kamar " + " . Total harganya Rp ." + total );
                                                                                            outs.newLine();
                                                                                            outs.close();
                                                                                            }catch(IOException e){
                                                                                            System.out.println("There was a problem found: " + e);}
                                                                if (kap_tipek5==0)
                                                                {
                                                                System.out.println("Kapasitas kamar telah habis");
                                                                System.out.println("Kembali ke daftar hotel(Y/N) :");
                                                                balik = scan.nextLine();
                                                                
                                                                }else{
                                                                System.out.println("Sisa kapasitas kamar yang tersedia :"+kap_tipek5);
                                                                log=0;
                                                                System.out.println("Kembali ke daftar hotel (Y/N)");
                                                                balik = scan.nextLine();
                                                                }
                                                                
                                                            }
                                                            else if(pil>5){
                                                            System.out.println("Pilihan anda salah");
                                                            System.out.println("Kembali ke daftar hotel (Y/N)");
                                                                balik = scan.nextLine();
                                                            }
                                                        }                                           
                                            }while(balik.equalsIgnoreCase("n"));
                                            break;
                                                                                        
                                        
                                    case 2:
                                        do{
                                            mn.cover();
                                            System.out.println("||================================||");
                                            System.out.println("|| Menampilkan Data Hasil Inputan ||");
                                            System.out.println("||================================||");
                                           {
                                            try{
                                            ins = new BufferedReader(new FileReader("Pesanan Kamar.txt"));
                                            while((read = ins.readLine()) != null){
                                            System.out.println(read);
                                            
                                            }
                                            ins.close();
                                            }catch(IOException e){
                                            System.out.println("There was a problem found: " + e);}
                                            }
                                            
                                            System.out.print("Apakah Anda ingin Kembali ke Menu? (Y/N) :");
                                            balik = scan.nextLine();
                                        }while(balik.equalsIgnoreCase("n"));
                                        
                                    case 3:
                                    break;
                                    
                                    default:
                                        System.out.println("nomer tidak termasuk");
                                        menu=1;
                                    break;
                                
                                }
                                    
                                
                            
                            }while(menu_2<3);
                        break;
                       
                    case 3:
                    do{    
                        mn.cover();
                        mn.Tipe_Hotel();
                        System.out.print("jumlah kamar yang terjual pada Standart Room :");
                            tipek_1 = adhitya.nextInt();
                        System.out.print("Harga kamar :");
                            harga_1 = adhitya.nextInt();
                        System.out.println("");
                        System.out.print("jumlah kamar yang terjual pada Superior Room :");
                            tipek_2 = adhitya.nextInt();
                        System.out.print("Harga kamar :");
                            harga_2 = adhitya.nextInt();
                        System.out.println("");;
                        System.out.print("jumlah kamar yang terjual pada Deluxe Room :");
                            tipek_3 = adhitya.nextInt();
                        System.out.print("Harga kamar :");
                            harga_3 = adhitya.nextInt();
                        System.out.println("");
                        System.out.print("jumlah kamar yang terjual pada Suite Room :");
                            tipek_4 = adhitya.nextInt();
                        System.out.print("Harga kamar :");
                            harga_4 = adhitya.nextInt();
                        System.out.println("");
                        System.out.print("jumlah kamar yang terjual pada Penthouse Room :");
                            tipek_5 = adhitya.nextInt();
                        System.out.print("Harga kamar :");
                            harga_5 = adhitya.nextInt();
                        System.out.println("");
                    //perhitungan omset harian
                        System.out.println("");
                        total = (tipek_1 * harga_1)+ (tipek_2 * harga_2) + (tipek_3 * harga_3) + (tipek_4 * harga_4) + (tipek_5 * harga_5);
                        System.out.println("=============================================================");
                        System.out.println("");
                        System.out.println("Omset perhari HOTEL ANTARIKSA Rp." + total);
                        System.out.println("");
                        System.out.println("=============================================================");
                        System.out.println("");
                        System.out.print("Apakah Anda ingin Kembali ke Menu? (Y/N) :");
                        balik = scan.nextLine();
                    }while(balik.equalsIgnoreCase("n"));
                    break;
                    
                    case 4:
                        do{
                        mn.cover();
                        System.out.println("");
                        String cara[] = new String[6];
                        cara[0] = "1. FAQ ";
                        cara[1] = "2. Call Center";
                        cara[2] = "3. Syarat dan Keentuan";
                        cara[3] = "4. Live Support";
                        cara[4] = "5. Customer Care Policy";    
                        System.out.println(cara[0]);
                        System.out.println(cara[1]);
                        System.out.println(cara[2]);
                        System.out.println(cara[3]);
                        System.out.println(cara[4]);
                        System.out.println("Apakah Anda ingin Kembali ke Menu? (Y/N) :");
                        balik = scan.nextLine();
                        }while(balik.equalsIgnoreCase("n"));
                    break;
                    
                    case 5:
                    System.exit(0);
                    break;
                        
                    default:
                    System.out.println("nomer tidak termasuk");
                    menu_utama=1;
                    
                    break;
                        
         
                }//menu utama
                        
        
            
        }while(menu_utama<5);//batas ulang menu utama
    }while(i<=2);    
    }
}    
    
