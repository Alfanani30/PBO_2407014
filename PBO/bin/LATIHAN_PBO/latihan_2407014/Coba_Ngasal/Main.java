package Coba_Ngasal;

public class Main {
    public static void main(String[] args) {

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(9);
        pp.setLebar(13);

        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());

        // Persegi
        Persegi persegi = new Persegi();
        persegi.setSisi(10);

        System.out.println("Sisi: " + persegi.getSisi());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
    }
}
