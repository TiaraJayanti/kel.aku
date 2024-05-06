public class cetakpolabintang {
    public static void main(String[] args) {
        int rows = 5; // Ubah sesuai dengan jumlah baris yang diinginkan

        // Loop untuk setiap baris
        for (int i = rows; i >= 1; i--) {
            // Loop untuk mencetak spasi sebelum bintang
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Loop untuk mencetak bintang
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            // Pindah ke baris baru setelah mencetak bintang pada setiap baris
            System.out.println();
        }
    }
}
