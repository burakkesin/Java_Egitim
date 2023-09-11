public class LoopDonguProje {
    public static void main(String[] args) {

        String hello = "Hello World";
        int stringUzunlugu = hello.length();
        int index =0;
        System.out.println(stringUzunlugu);
        String yeniString = "";

        while (index < stringUzunlugu){
            char bulunanKarakter = hello.charAt(index);
            if(bulunanKarakter == 'o'){
                yeniString = yeniString + 0;

            }else {
                 yeniString = yeniString + bulunanKarakter;
            }
            index++;
        }
        System.out.println(yeniString);
    }
}
