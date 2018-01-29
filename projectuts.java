import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public class projectuts {
  public void header(){
    System.out.println("=================================");
    System.out.println("========= 'Tiket Pesawat'========");
    System.out.println("=================================");
  }

  public void menu(){
    System.out.println("1. Daftar Maskapai");
    System.out.println("2. Harga");
    System.out.println("3. Transaksi Penjualan");
    System.out.println("4. Omset Perhari");
    System.out.println("5. Help");
    System.out.println("6. Display Transaksi");
	System.out.println("7. Exit");
  }

  public void total(){
    System.out.println("==============================================");
    System.out.println("                     Total         ");
    System.out.println("==============================================");
  }

  public static void main(String []args) throws IOException{
    Scanner maseko = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

    String maskapai[] = new String[5];
    maskapai[0] = "1. Garuda Indonesia";
    maskapai[1] = "2. Lion Air";
    maskapai[2] = "3. Citilink";
    maskapai[3] = "4. Batik Air";
    maskapai[4] = "5. Batavia Air";

	String read;
	BufferedReader ins;
	BufferedWriter outs;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    projectuts eko = new projectuts();

    String user="";
    String pass="";
    String ulang="";
    String balik="";
    int i = 0;
    int pilih_menu, pilih_fitur, tiket0, tiket1=0, tiket2, tiket3, tiket4, total;


do {
  eko.header();
  System.out.print("Masukkan Username Anda : ");
  user = maseko.nextLine();
  System.out.print("Masukkan Pasword anda : ");
  pass = maseko.nextLine();

 if (user.equals("admin") && pass.equals("123")){
   System.out.println("Berhasil");
   break;

 }else {

   System.out.println("Username or Password Invalid");

   ulang = maseko.nextLine();
   i++;
   if (i == 3){
     System.exit(0);
   }
 }
 }while( i <= 3) ;


do {
 eko.header();
 eko.menu();
 System.out.print("Masukkan Pilihan Anda : ");
  pilih_menu = maseko.nextInt();
 switch (pilih_menu) {
   case 1 :
   eko.header();
   System.out.println("Daftar Maskapai : ");



   System.out.println(maskapai[0]);
   System.out.println(maskapai[1]);
   System.out.println(maskapai[2]);
   System.out.println(maskapai[3]);
   System.out.println(maskapai[4]);
   System.out.println("");
   System.out.println("Tekan Enter Untuk Kembali.");
   ulang = scan.nextLine();
   break;

   case 2 :
      eko.header();
      System.out.println(maskapai[0]+"\t = Rp. 1.200.000,-");
      System.out.println(maskapai[1]+"\t\t = Rp. 1.000.000,-");
      System.out.println(maskapai[2]+"\t\t = Rp. 400.000,-");
      System.out.println(maskapai[3]+"\t\t = Rp. 400.000,-");
      System.out.println(maskapai[4]+"\t\t = Rp. 400.000,-");
      System.out.println();
      System.out.print("Tekan Enter Untuk Kembali.");
      ulang = scan.nextLine();
      break;

      case 3 :
      eko.header();
      System.out.println(maskapai[0]);
      System.out.println(maskapai[1]);
      System.out.println(maskapai[2]);
      System.out.println(maskapai[3]);
      System.out.println(maskapai[4]);
      System.out.print("Pilih Jenis Maskapai : ");
      pilih_fitur = maseko.nextInt();
        switch(pilih_fitur){
          case 1 :
          do {
          eko.header();
          System.out.println("Maskapai \t: "+maskapai[0]);
          System.out.print("Jumlah Tiket : ");
          tiket0 = maseko.nextInt();
		  
        } while(tiket0 <= 0);
          total = tiket0 * 1200000;
          System.out.println("Konfirmasi Pemesanan Tiket");
          System.out.println("Tekan 'Y' Untuk Konfirmasi ");
          System.out.println("Tekan 'N' Untuk Kembali Ke Menu Utama");
          ulang = scan.nextLine();
		  

          if (ulang.equals("y")||ulang.equals("Y")){
            eko.total();
            System.out.println(" Jenis Maskapai \t"+"Jumlah\t"+"     Harga" );
            System.out.println("  "+maskapai[0]+"    "+tiket0+"\t  Rp.1.200.000,-");
            System.out.println("==============================================");
            System.out.println("                       Total : Rp. "+total+",-");
            System.out.println("");
			try{
				outs = new BufferedWriter(new FileWriter("Maskapai.txt",true));
				outs.write("Maskapai "+pilih_fitur+" Jumlah Tiket Yang Dibeli: "+tiket0+" Total Harga: "+ total);
				outs.newLine();
				outs.close();
		  }catch(IOException e){
			  System.out.println("There was a problem found"+e);
		  }
            System.out.println("Tekan Enter Untuk Kembali Ke Menu.");
            ulang = scan.nextLine();
          }

          break;

          case 2 :
            do{
          eko.header();
          System.out.println("Maskapai \t: "+maskapai[1]);
          System.out.print("Jumlah Tiket : ");
          tiket1 = maseko.nextInt();
		  
        }while(tiket1 <= 0);
          total = tiket1 * 1000000;
          System.out.println("Konfirmasi Pemesanan Tiket");
          System.out.println("Tekan 'Y' Untuk Konfirmasi ");
          System.out.println("Tekan 'N' Untuk Kembali Ke Menu Utama");
          ulang = scan.nextLine();

          if (ulang.equals("y")||ulang.equals("Y")){
            eko.total();
            System.out.println(" Jenis Maskapai \t"+"Jumlah\t"+"     Harga" );
            System.out.println("  "+maskapai[1]+"    "+tiket1+"\t Rp.1.000.000,-");
            System.out.println("==============================================");
            System.out.println("                       Total : Rp. "+total+",-");
            System.out.println("");
			try{
				outs = new BufferedWriter(new FileWriter("Maskapai.txt",true));
				outs.write("Maskapai "+pilih_fitur+" Jumlah Tiket Yang Dibeli: "+tiket1+" Total Harga: "+total);
				outs.newLine();
				outs.close();
		  }catch(IOException e){
			  System.out.println("There was a problem found"+e);
		  }
            System.out.println("Tekan Enter Untuk Kembali Ke Menu.");
            ulang = scan.nextLine();
			
          }

          break;

          case 3 :
          do {
          eko.header();
          System.out.println("Maskapai \t: "+maskapai[2]);
          System.out.print("Jumlah Tiket : ");
          tiket2 = maseko.nextInt();
		  
        }while(tiket2 <= 0);
          total = tiket2 * 400000;
          System.out.println("Konfirmasi Pemesanan Tiket");
          System.out.println("Tekan 'Y' Untuk Konfirmasi ");
          System.out.println("Tekan 'N' Untuk Kembali Ke Menu Utama");
          ulang = scan.nextLine();

          if (ulang.equals("y")||ulang.equals("Y")){
            eko.total();
            System.out.println(" Jenis Maskapai \t"+"Jumlah\t"+"     Harga" );
            System.out.println("  "+maskapai[2]+"    "+tiket2+"\t Rp.400.000,-");
            System.out.println("==============================================");
            System.out.println("                       Total : Rp. "+total+",-");
            System.out.println("");
			try{
				outs = new BufferedWriter(new FileWriter("Maskapai.txt",true));
				outs.write("Maskapai "+pilih_fitur+" Jumlah Tiket Yang Dibeli: "+tiket1+" Total Harga: "+total);
				outs.newLine();
				outs.close();
		  }catch(IOException e){
			  System.out.println("There was a problem found"+e);
		  }
            System.out.println("Tekan Enter Untuk Kembali Ke Menu.");
            ulang = scan.nextLine();
          }
          break;

          case 4 :
          do {
          eko.header();
          System.out.println("Maskapai \t: "+maskapai[3]);
          System.out.print("Jumlah Tiket : ");
          tiket3 = maseko.nextInt();
		  
        }while(tiket3 <= 0);
          total = tiket3 * 400000;
          System.out.println("Konfirmasi Pemesanan Tiket");
          System.out.println("Tekan 'Y' Untuk Konfirmasi ");
          System.out.println("Tekan 'N' Untuk Kembali Ke Menu Utama");
          ulang = scan.nextLine();
				
          if (ulang.equals("y")||ulang.equals("Y")){
            eko.total();
            System.out.println(" Jenis Maskapai \t"+"Jumlah\t"+"     Harga" );
            System.out.println("  "+maskapai[3]+"    "+tiket3+"\t Rp. 400.000,-");
            System.out.println("==============================================");
            System.out.println("                       Total : Rp. "+total+",-");
            System.out.println("");
			try{
				outs = new BufferedWriter(new FileWriter("Maskapai.txt",true));
				outs.write("Maskapai "+pilih_fitur+" Jumlah Tiket Yang Dibeli: "+tiket1+" Total Harga: "+total);
				outs.newLine();
				outs.close();
		  }catch(IOException e){
			  System.out.println("There was a problem found"+e);
		  }
            System.out.println("Tekan Enter Untuk Kembali Ke Menu.");
            ulang = scan.nextLine();
          }
          break;
          case 5 :
          do{
          eko.header();
          System.out.println("Maskapai \t: "+maskapai[4]);
          System.out.print("Jumlah Tiket : ");
          tiket4 = maseko.nextInt();
		  
        }while(tiket4 <= 0);
          total = tiket4 * 400000;
          System.out.println("Konfirmasi Pemesanan Tiket");
          System.out.println("Tekan 'Y' Untuk Konfirmasi ");
          System.out.println("Tekan 'N' Untuk Kembali Ke Menu Utama");
          ulang = scan.nextLine();

          if (ulang.equals("y")||ulang.equals("Y")){
            eko.total();
            System.out.println(" Jenis Maskapai \t"+"Jumlah\t"+"     Harga" );
            System.out.println("  "+maskapai[4]+"    "+tiket4+"\t Rp.400.000,-");
            System.out.println("==============================================");
            System.out.println("                       Total : Rp. "+total+",-");
            System.out.println("");
			try{
				outs = new BufferedWriter(new FileWriter("Maskapai.txt",true));
				outs.write("Maskapai "+pilih_fitur+" Jumlah Tiket Yang Dibeli: "+tiket1+" Total Harga: "+total);
				outs.newLine();
				outs.close();
		  }catch(IOException e){
			  System.out.println("There was a problem found"+e);
		  }
            System.out.println("Tekan Enter Untuk Kembali Ke Menu.");
            ulang = scan.nextLine();
          } break;

        }  break;

    case 4 :
    eko.header();
    System.out.println("Omset Perhari");
    System.out.println("Tekan Enter Untuk Kembali Ke Menu.");
    ulang = scan.nextLine();
    break;


    case 5 :
    eko.header();
    System.out.println("Bantuan : ");
    System.out.println("1. Lihat Terlebih Dahulu Daftar Maskapai Dan Harga Pada Menu Program");
    System.out.println("2. Pilih Menu Transaksi Penjualan Untuk Membeli Tiket.");
    System.out.println("3. Ikuti Langkah-Langkah Dari Menu Pemesanan Tiket Tersebut.");
    System.out.println("4. Jika Sudah Maka Ada Nota Yang keluar dari Proses Transaksi Tersebut.");
    System.out.println("");
    System.out.println("NB : ");
    System.out.println("1. Program Ini Tidak Bisa Langsung Membeli Lebih Dari Satu Tiket Saat Transaksi.");
    System.out.println("2. Jika Ingin Keluar Dari Program, Pilih Menu Exit");
    System.out.println("Tekan Enter Untuk Kembali Ke Menu.");
    ulang = scan.nextLine();
    break;
	
	case 6:
	{
        try{
        ins = new BufferedReader(new FileReader("Maskapai.txt"));
        while((read = ins.readLine()) != null){
        System.out.println(read);
                                            
        }
        ins.close();
        }catch(IOException e){
        System.out.println("There was a problem found: " + e);}
        }
	break;

    case 7 :
    System.out.println("Apakah Anda Ingin Keluar Dari Program (Y/N) ? ");
    ulang = scan.nextLine();
    if (ulang.equals("Y")||ulang.equals("y")){
      System.exit(0);
    } else {
      break;
    }

    default :
    System.out.println("No Yang Anda Pilih Tidak Ada.");
    System.out.print("Tekan Enter Untuk Kembali.");

 }
}while(i<5);












  }
}
