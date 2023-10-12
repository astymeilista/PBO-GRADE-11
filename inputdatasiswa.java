/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DasarPemrogramanJava;

/**
 *
 * @author LAB1
 */
import java.util.Scanner;

public class inputdatasiswa {
     public static void main(String[] args) {
         String nama;
         Scanner scanner = new Scanner(System.in );
         System.out.println("masukkan nama: ");
         nama = scanner.nextLine();
         
         System.out.println("nama : " + nama);
         
         int kelas = 11;
         System.out.println("masukkan kelas: ");
         kelas = scanner.nextInt();
         
         System.out.println("kelas : " + kelas);
         
         float absen = 03;
         System.out.println("masukkan absen: ");
         absen= scanner.nextFloat();
         
         System.out.println("absen : " + absen);
         
         double umur = 16;
         System.out.println("masukkan umur: ");
         umur = scanner.nextDouble();
         
         System.out.println("umur : " + umur);
         
     }
}
