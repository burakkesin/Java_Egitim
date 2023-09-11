import java.util.Locale;

public class IlkStringDemo {
    public static void main(String[] args) {
        String ilkMetin = "Test Otomasyonu";
        String ikinciMetin = "Yazılım Testi";
        System.out.println(ilkMetin);
        System.out.println(ikinciMetin);

        int metinUzunlugu = ilkMetin.length();
        System.out.println(metinUzunlugu);

        String kucukHarf = ikinciMetin.toLowerCase();
        System.out.println(kucukHarf);

        String buyukHarf = ilkMetin.toUpperCase();
        System.out.println(buyukHarf);
        System.out.println(kucukHarf + "ve"+buyukHarf);

        String YeniString = "en sevdiğim \n\"film\" avatar";
        System.out.println(YeniString);


    }
}
