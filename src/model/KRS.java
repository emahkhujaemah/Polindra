package model;

import model.Matakuliah;

public class KRS {
    private String noKRS;
    private Matakuliah paketMatakuliah;

    public KRS(String noKRS){
        this.noKRS = noKRS;
    }

    public void tambahMatakuliahKRS(Matakuliah matakuliah){

    }

    public Matakuliah showMatakuliah(){

    }

    public void setNOKRS(String noKRS){
        this.noKRS = noKRS;
    }

    public String getNOKRS(){
        return noKRS;
    }
}
