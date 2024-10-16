package looping;

public class GanjilGenap {
    public static void main (String [] args) {
        System.out.println ("Deret bikanagan ganjil dangenap dari 0 - 20");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println (i + " adalah bilangan genap");
            } else {
                System.out.println (i + " adalah bilangan ganjil");
            }
          
        }
    }
}
