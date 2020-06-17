/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input_Output;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 8
 */
public class Scan_ner {
    public static void main(String[] args) {
            double nilai_akhir;    
	Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan Nama :");
        String nama= sc.next();
        System.out.println("Masukkan NIM :");
        int nim= sc.nextInt();
        System.out.println("Nilai UTS :");
        int uts= sc.nextInt();
        System.out.println("Nilai UAS :");
        int uas= sc.nextInt();
        nilai_akhir= 0.4*uts+0.6*uas;
                
        System.out.println("=========PROGRAM PENGHITUNG NILAI AKHIR=========");
        System.out.println("Nama Mahasiswa  :"+nama);
        System.out.println("NIM             :"+nim);
        System.out.println("Nilai Akhir     :"+nilai_akhir);
    }
}
