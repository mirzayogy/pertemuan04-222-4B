package com.mirzayogy.pertemuan04.b;
public class Main {
    public static void main(String[] args) {
        
        Mahasiswa adul;
        adul = new Mahasiswa();
        adul.nama = "Adul Bin Kidul";
        adul.tinggiBadan = 200;
        adul.npm = "201010101010";
        adul.usia = 100;
        
        adul.belajar();
        adul.masukKelas();
        
        Mahasiswa bejo = new Mahasiswa();
        
        bejo.nama = "Bejo bin Lucky";
        bejo.tinggiBadan = 50;
        bejo.npm = "20111111";
        bejo.usia = 50;
        
        bejo.belajar();
        bejo.masukKelas();
        

        
    }
}
