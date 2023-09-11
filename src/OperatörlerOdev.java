public class OperatörlerOdev {
    public static void main(String[] args) {

        int a = 85;
        int b = 45;

        int toplam = a+b;
        int carpım = a*b;

        System.out.println("Sayıların Toplam" + toplam + "degerlendir");

        if(carpım > 3000 && carpım < 4000){
            System.out.println("Carpım degeri"+ carpım);
        }
    }
}
