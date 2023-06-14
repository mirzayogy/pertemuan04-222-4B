package com.mirzayogy.pertemuan04.b;

public class Mahasiswa {
    String nama;
    String alamat;
    String npm;
    double tinggiBadan;
    int usia;
    
    //contoh overloading
    public void simpan(){
        System.out.println("Simpan Superclass");
    }
    
    public void simpan(String nama, String npm){
        
    }
    
    public void simpan(String npm, String nama, String alamat){
        
    }
    
    void belajar(){
        System.out.println(nama +" sedang belajar");
    }
    
    void masukKelas(){
        System.out.println(nama + " masuk kelas");
    }
    
    public Mahasiswa(){
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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    
    
    
    
    
}
