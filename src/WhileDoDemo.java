public class WhileDoDemo {
    public static void main(String[] args) {

        for(int i = 1;i <= 5; i++){
            System.out.println("For loop u ile " + i);

        }
        System.out.println("------------------");

        int j= 1 ;


        System.out.println("---------------");

        do{
            if(j>5){
                break;
            }
            System.out.println("Do while loop ile sayımız " + j);
            j++;

        }while (true);
    }
}
