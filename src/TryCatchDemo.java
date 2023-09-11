public class TryCatchDemo {
    public static void main(String[] args) {

        int[] sayılar ={1,5,10,555,678,};
        try {
            System.out.println(sayılar[5]);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hata sonrası yazdır");
    }
}
