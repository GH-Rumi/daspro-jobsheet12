import java.util.Scanner;

public class Tugas311 {
    static boolean primaRekursif(int n, int i) {
        if (i <= 1) return true;
        if (n % i == 0) return false;
        return primaRekursif(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input angka lebih dari 2: ");
        int a = sc.nextInt();

        if (a < 2) {
            System.out.println("Mohon input angka lebih dari 2");
        } else if (primaRekursif(a, a / 2)) {
            System.out.println("Bilangan prima");
        } else {
            System.out.println("Bukan bilangan prima");
        }
    }
}
