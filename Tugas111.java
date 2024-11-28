import java.util.Scanner;

public class Tugas111 {
    static void rekursif(int n) {
        if (n < 0) return;
        System.out.print(n + " ");
        rekursif(n - 1);
    }

    static void iteratif(int n) {
        while (n >= 0) {
            System.out.print(n + " ");
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input angka: ");
        int n = sc.nextInt();

        System.out.println("\nOutput Rekursif:");
        rekursif(n);

        System.out.println("\nOutput Iteratif:");
        iteratif(n);
    }
}
