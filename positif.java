import java.util.Scanner;

public class positif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPositives = 0;
        int number;

        System.out.println("Masukkan bilangan positif (masukkan bilangan negatif untuk berhenti):");

        do {
            System.out.print("Masukkan bilangan: ");
            number = scanner.nextInt();

            if (number >= 0) {
                totalPositives += number;
            }
        } while (number >= 0);

        System.out.println("Jumlah bilangan positif yang dimasukkan: " + totalPositives);

        scanner.close();
    }
}
