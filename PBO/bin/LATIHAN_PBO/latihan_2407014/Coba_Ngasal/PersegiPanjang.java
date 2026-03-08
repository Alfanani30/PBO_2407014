package Coba_Ngasal;

public class PersegiPanjang {
    protected double panjang;
    protected double lebar;

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }



}

