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

public class hitungnilairata2 {
    public static void main(String[] args) {
        int nilaimtk = 95;
        int nilaibindo = 90;
        int nilaipbo = 85;
        int nilaiiot = 85;
        int nilaibasisdata = 85;
        int nilaippl = 85;
        int nrr;
        
        nrr = (nilaimtk + nilaibindo + nilaipbo + nilaiiot + nilaibasisdata + nilaippl)/6;
        System.out.println("nilai rata rata = "+ nrr);
        
        if (nrr > 70){
            System.out.println("LULUS");  
        }
        else if (nrr < 70){
            System.out.println("TIDAK LULUS");
        }
    }
    
}
