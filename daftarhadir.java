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

public class daftarhadir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nama;
        
        System.out.println("panggil nama siswa :" );
        nama = scanner.next();
        switch (nama) {
            case "asty":
                 System.out.println("asty hadir");
                 break;
            default:
                 System.out.println("tidak hadir");
       }
    }
}
