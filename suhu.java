import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Konversi suhu dari Celsius ke Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Cetak hasil konversi dengan presisi dua desimal
        System.out.printf("Suhu dalam Fahrenheit: %.2f%n", fahrenheit);
        
        scanner.close();
    }
}
