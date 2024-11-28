import java.util.Scanner;

public class Tugas211 {
    static int jumlah(int n) {
        if (n == 0) {
            System.out.print(n);
            return n;
        } else {
            System.out.print(n);
            if (n > 0) System.out.print(" + ");
            return n + jumlah(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input angka: ");
        int a = sc.nextInt();
        
        System.out.print("Hasil: ");
        int hasil = jumlah(a);
        System.out.println(" = " + hasil);
    }
}