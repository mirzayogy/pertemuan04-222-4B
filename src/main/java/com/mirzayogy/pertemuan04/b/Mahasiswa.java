package com.mirzayogy.pertemuan04.b;

public class Mahasiswa {
    String nama;
    String alamat;
    String npm;
    double tinggiBadan;
    int usia;
    
    void belajar(){
        System.out.println(nama +" sedang belajar");
    }
    
    void masukKelas(){
        System.out.println(nama + " masuk kelas");
    }
    
    Mahasiswa(){
        this.nama = "Nama masih kosong";
        this.alamat = "Alamat masih kosong";
        System.out.println("New Mahasiswa");
    }

    public Mahasiswa(String nama, String alamat, String npm, double tinggiBadan, int usia) {
        this.nama = nama;
        this.alamat = alamat;
        this.npm = npm;
        this.tinggiBadan = tinggiBadan;
        this.usia = usia;
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    
    
    
}
