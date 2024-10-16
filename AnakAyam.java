package looping;

public class AnakAyam {
    public static void main (String [] args) {
        System.out.println ("Lagu 'Anak Ayam Turun N'");
        int n = 10;
        while (n > 0) {
            System.out.println ("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        }
        System.out.println ("anak ayam turun 0, mati semua");
    }
}
