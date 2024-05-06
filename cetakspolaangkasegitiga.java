public class cetakspolaangkasegitiga {
    public static void main(String[] args) {
        int rows = 5; // Jumlah baris
        
        // Loop untuk setiap baris
        for (int i = 1; i <= rows; i++) {
            // Loop untuk mencetak angka dari 1 hingga 5
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
