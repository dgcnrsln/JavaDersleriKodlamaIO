public class Main {
    public static void main(String[] args) {
        //For
        for (int i=2; i<=10; i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        //While - Koşul sağlanmazsa asla döngüye girmez.
        int i = 1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While - koşul sağlanmasa bile bir kere çalışır.
        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}