import java.util.Scanner;

public class hurufvokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine().toLowerCase(); // Konversi ke huruf kecil untuk memudahkan perhitungan
        
        int jumlahVokal = 0;
        
        // Menghitung jumlah huruf vokal
        for (int i = 0; i < input.length(); i++) {
            char huruf = input.charAt(i);
            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
                jumlahVokal++;
            }
        }
        
        System.out.println("Jumlah huruf vokal dalam kata atau kalimat tersebut: " + jumlahVokal);
        
        scanner.close();
    }
}
