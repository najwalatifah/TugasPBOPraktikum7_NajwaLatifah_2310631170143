package looping;
public class BilanganPrima {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Deret prima dan bukan prima dari 0-20");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
              System.out.println(i + " bukan bilangan prima");
            }
        }
    }
    public static boolean isPrime (int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) return false;
        }
    return true;
    }
}

