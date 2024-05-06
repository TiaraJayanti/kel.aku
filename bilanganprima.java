import java.util.Scanner;

public class bilanganprima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: 20 ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Bilangan tersebut adalah bilangan prima");
        } else {
            System.out.println("Bilangan tersebut bukan bilangan prima");
        }

        scanner.close();
    }
}
