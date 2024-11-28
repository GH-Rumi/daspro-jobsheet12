import java.util.Scanner; 
public class Tugas411 { 
    static int cariFibonacci(int n) { 
        if (n==0) { 
            return 0; 
        } else if (n==1) { 
            return 1; 
        } else { 
            return cariFibonacci(n - 1) + cariFibonacci(n - 2); 
        } 
    } 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Input lama bulan: "); 
        int a = sc.nextInt(); 
 
        for (int i = 0; i <= a; i++) { 
            System.out.print(cariFibonacci(i) + " "); 
        } 
    } 
} 
 