/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author WINDOWS 8
 */
public class Buffer_Reader {
    public static void main(String[] args) {
           BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

    try {

        System.out.print("Nama Lengkap : ");
        String nama = dataIn.readLine();
        System.out.println("Prodi : ");
        String prodi = dataIn.readLine();
        System.out.print("NIM : ");
        int nim = Integer.parseInt(dataIn.readLine());
        System.out.println("Alamat : ");
        String alamat = dataIn.readLine();
        
        System.out.println("=============BIODATA MAHASISWA==============");
        System.out.println("Nama Lengkap    : " + nama );
        System.out.println("Prodi           : " + prodi);
        System.out.println("NIM             :" + nim);
        System.out.println("Alamat          : " + alamat);
} 
    catch (IOException ex) {
        System.out.println("Error pada saat input data");
}
    }
}
