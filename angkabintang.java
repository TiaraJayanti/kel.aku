import java.util.Scanner;

public class angkabintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka bulat positif: ");
        int angka =  scanner.nextInt();
        
        if (angka > 0) {
            for (int i = 1; i <= angka; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Angka yang dimasukkan harus positif.");
        }
        
        scanner.close();
    }
}


