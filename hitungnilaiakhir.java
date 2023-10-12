/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrogramanJava;

import java.util.Scanner;

/**
 *
 * @author LAB1
 */
public class hitungnilaiakhir {

      public static void main(String[] args) {
          
          //masukkan data yang di inginkan sesuai dengan variable
          String nama;
          Scanner scanner = new Scanner(System.in );
          System.out.println("nama :");
          nama = scanner.nextLine();
          
          System.out.println("nama : " + nama); //sebagai keluaran atau print cetak + variable
         
          int kelas;
          System.out.println("kelas: ");
          kelas = scanner.nextInt();
         
          System.out.println("kelas : " + kelas);
         
          int absen;
          System.out.println("absen: ");
          absen= scanner.nextInt();
         
          System.out.println("absen : " + absen);
         
          int nilaitugas;
          System.out.println("masukkan nilai tugas: ");
          nilaitugas = scanner.nextInt();
        
          int nilaiUts;
          System.out.println("masukkan nilai UTS: ");
          nilaiUts = scanner.nextInt();
         
          System.out.println("nilai UTS : " + nilaiUts);
         
          int nilaiuas;
          System.out.println("masukkan nilai UAS: ");
          nilaiuas = scanner.nextInt();
         
          System.out.println("masukkan nilai UAS : " + nilaiuas);
          
          int hasil; // jangan lupa sertakan ini
          
          
          hasil = (nilaitugas * 10/100) + (nilaiUts * 30/100) + (nilaiuas * 60/100); //menghitung nilai yang diperlukan 
          System.out.println("hasil akhir :" + hasil);
          
          if (hasil >= 85){
              System.out.println("A");
          }
          else if (hasil >=75){
              System.out.println("B"); // gunakan if else 
          }     
          else if (hasil >=65){
              System.out.println("C");
          }
          else if (hasil >=50){
              System.out.println("E");
              
              //seltelah dijalankan program akan mengeluarkan hasil nilai sesuai dengan "hasil"
          }
   }

// maff klw egx jelas yh
}
