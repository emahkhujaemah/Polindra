package model;

import model.Matakuliah;

public class Dosen extends Person{
    private String nidn;
    private Matakuliah listMatakuliahPengampu;
    private Matakuliah matakuliahPengampu;

    public Dosen(String nidn, String nama){
        this.nidn = nidn;
        this.nama = nama;
    }

    public void lihatListMatakuliahPengampu(){

    }

    public void tambahMatakuliahPengampu(Matakuliah matakuliah){

    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    public String getNidn() {
        return nidn;
    }
}