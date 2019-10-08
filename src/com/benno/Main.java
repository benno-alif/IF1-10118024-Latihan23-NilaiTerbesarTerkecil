package com.benno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menemukan Nilai terbesar dan terkecil
     */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilaiArr = new ArrayList<>();

        String namaPetugas;
        int banyakMhs, i, nilaiMhs, num=1;
        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = scanner.nextInt();

        for (i=1; i <= banyakMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilaiMhs = scanner.nextInt();
            nilaiArr.add(nilaiMhs);
        }

        System.out.println();
        System.out.println("====Hasil Nilai Mahasiswa====");
        for (i = 0; i < nilaiArr.size();i++){
            System.out.println("Nilai Mahasiswa ke-" + num++ + " = " + nilaiArr.get(i));
        }

        System.out.println();
        System.out.println("Nilai Terbesar adalah " + Collections.max(nilaiArr));
        System.out.println("Nilai Terkecil adalah " + Collections.min(nilaiArr));

        System.out.println();
        System.out.println("Petugas : " + namaPetugas);
    }
}
