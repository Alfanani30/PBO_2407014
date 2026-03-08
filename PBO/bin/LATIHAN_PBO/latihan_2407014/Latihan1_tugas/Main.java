package Latihan1_tugas;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PILIH BANGUN DATAR ===");
        System.out.println("1. Segitiga");
        System.out.println("2. Jajar Genjang");
        System.out.print("Masukkan pilihan: ");

        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
        
                SegiTiga sTiga = new SegiTiga();
                System.out.print("Masukkan alas segitiga: ");
                sTiga.setAlas(input.nextDouble());

                System.out.print("Masukkan tinggi segitiga: ");
                sTiga.setTinggi(input.nextDouble());

                System.out.println("Luas Segitiga adalah : " + sTiga.LuasSegiTiga());
                break;

            case 2:
                JajarGenjang jGenjang = new JajarGenjang();

                System.out.print("Masukkan alas jajar genjang: ");
                jGenjang.setAlas(input.nextDouble());

                System.out.print("Masukkan tinggi jajar genjang: ");
                jGenjang.setTinggi(input.nextDouble());

                 System.out.println("Luas Jajar Genjang adalah :" + jGenjang.LuasJajarGenjang());
                 break;


            default:
                System.out.println("Pilihan tidak tersedia!");
        }


            input.close();
    }
}
