public class LoopDöngüDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("Değisken degeri" + "" + i);
        }

        System.out.println("--------------------------");

        for (double b = 0; b<10 ; b = b+ 0.25 ) {
            System.out.println("Değisken degeri" + "" + b);
        }

        System.out.println("------------------");


        int sayfa = 5;
        for(int c =0; c < sayfa ; c++){
            System.out.println("sayfa sayısı " + c);
            if (c == 3) {
                System.out.println("Koşul saglandı " + c);
                break;
            }
            }
        System.out.println("----------------------");

        String[] isimler = {"Ozan" ,"Samet","hazal","tibet"};

        for (int d = 0; d < isimler.length ; d++){
            System.out.println("listedeki isimler " + isimler[d]);
        }

        System.out.println("------------------------");

        for(String isim : isimler){
            System.out.println("Gelişmiş döngü ile isimler " + isimler);
        }
    }
    }

