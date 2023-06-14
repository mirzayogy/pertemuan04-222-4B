package com.mirzayogy.pertemuan04.b;

public class MahasiswaTransfer extends Mahasiswa
{
    
    double ipkSebelumnya;
    String ptSebelumnya;
    
    public void simpan(){
        System.out.println("Simpan Subclass");
        super.simpan();
    }
    
}
