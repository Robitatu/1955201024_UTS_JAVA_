/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Sederhana;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 8
 */
public class Program_Pilihan_Prodi {
    public static void main(String[] args) {
                Scanner dataIn = new Scanner(System.in);
        int fakultas;
        int fakultas1=1;
        System.out.println("========== PROGRAM PILIHAN PRODI SESUAI FAKULTAS DI UNU BLITAR TAHUN 2020 ========== ");
        System.out.println(" \n Pilihan :\n 1. Fakultas Ilmu Eksakta \n 2. Fakultas Ilmu Sosial dan Pendidikan \n 3. Fakultas Agama Islam \n ");
        System.out.println(" Masukkan pilihan : \n ");
        fakultas = dataIn.nextInt();
        
        switch (fakultas) {
            case 1:
                while (fakultas1<=6){
                    System.out.println(" Ada 6 prodi dalama Fakultas Ilmu Eksakta, yaitu :\n");
                    System.out.println( fakultas1 + ". Imu Komputer ");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Teknik Mesin");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Teknik Sipil");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Peternakan");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Pendidikan Fisika");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Pendidikan Matematika");
                    fakultas1++;
                }
                break;
                
            case 2:
                while(fakultas1<=4){
                    System.out.println(" Ada 4 prodi dalama Fakultas Ilmu Sosial dan Pendidikan, yaitu :\n");
                    System.out.println( fakultas1 + ". PGSD");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Pendidikan Bahasa Inggris");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Pendidikan Bahasa Indonesia");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Pendidikan Olahraga");
                    fakultas1++;
                }
                break;
            default:
                while (fakultas1<=7){
                    System.out.println(" Ada 7 prodi dalama Fakultas Agama Islam, yaitu :\n");
                    System.out.println( fakultas1 + ". Psikologi Islam");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Ekonomi Syariah");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Hukum Keluarga Islam");
                    fakultas1++;
                    System.out.println( fakultas + ". Komunikasi Penyiaran Islam");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Pendidikan Islam Anak Usia Dini");
                    fakultas1++;
                    System.out.println( fakultas + ". Perbankan Syariah");
                    fakultas1++;
                    System.out.println( fakultas1 + ". Ilmu Al-Qur'an dan Tafsir");
                    fakultas1++;
                }
                break;
        }
    }
}
