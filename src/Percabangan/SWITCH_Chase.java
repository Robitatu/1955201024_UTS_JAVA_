/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 8
 */
public class SWITCH_Chase {
    public static void main(String[] args) {
                double nilai_akhir;
        Scanner dataIn = new Scanner(System.in);
        System.out.println("======== PROGRAM PENGECEKAN KELULUSAN========");
        System.out.println("Masukkan Nilai UTS : ");
        int uts= dataIn.nextInt();
        System.out.println("Masukkan Nilai UAS :");
        int uas= dataIn.nextInt();
        nilai_akhir= 0.4*uts+0.6*uas;
        
      
    if(nilai_akhir > 70){
        System.out.println("\n SELAMAT,ANDA LULUS ! ");
    }
 else {
System.out.println("\n MAAF, ANDA TIDAK LULUS !");
}
    }
}
