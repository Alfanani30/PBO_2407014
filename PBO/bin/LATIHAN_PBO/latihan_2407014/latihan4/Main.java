package latihan4;

public class Main {
    
    public static void main(String[] args) {
        SegiTiga sTiga = new SegiTiga();

        sTiga.setAlas(2);
        sTiga.setTinggi(3);
        System.out.println("Luas Segitiga adalah : " + sTiga.LuasSegiTiga());

        JajarGenjang jGenjang = new JajarGenjang();

        jGenjang.setAlas(100);
        jGenjang.setTinggi(50);
        System.out.println("Luas Jajar Genjang adalah :" + jGenjang.LuasJajarGenjang());

    }
}
