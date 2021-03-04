package model;
// import model.KRS;

public class Mahasiswa extends Person{
    private String nim;
    private KRS krs;

    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public void showProfil(){
        
    }

    public void cetakKRS(){
        System.out.println("Cetak KRS");
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void pilihPaketKRS(KRS krs){

    }

    public KRS getKRS(){
        return krs;
    }

}
