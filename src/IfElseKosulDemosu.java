public class IfElseKosulDemosu {
    public static void main(String[] args) {

        int saat = 1000;

        if(saat<1200){
            System.out.println("saat ogleden once");
            if(saat == 1000){
                System.out.println("Gunaydın");
            }

        }else if (saat == 1200) {
            System.out.println("saat öglen");

        } else{
            System.out.println("Saat ogleden sonra");
        }
    }
}
