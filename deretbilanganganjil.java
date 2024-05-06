public class deretbilanganganjil{
    public static void main(String[] args) {
        int i = 1; // Mulai dari angka 1
        System.out.println("Deret bilangan ganjil dari 1 hingga 15:");
        while (i <= 15) { // Loop sampai mencapai angka 15
            if (i % 2 != 0) { // Cek apakah bilangan ganjil
                System.out.print(i + " "); // Cetak bilangan ganjil
            }
            i++; // Pindah ke bilangan berikutnya
        }
    }
}
