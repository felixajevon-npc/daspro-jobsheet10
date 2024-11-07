import java.util.Scanner;

public class SurveiKepuasan08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jmlResponden = 10;
        int jmlPertanyaan = 6;

        int[][] hasilSurvei = new int[jmlResponden][jmlPertanyaan];

        for (int i = 0; i < jmlResponden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < jmlPertanyaan; j++) {
                System.out.print("Masukkan nilai untuk pertanyaan " + (j + 1) + " (1-5): ");
                hasilSurvei[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Rata-rata untuk setiap responden:");
        for (int i = 0; i < jmlResponden; i++) {
            int total = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                total += hasilSurvei[i][j];
            }
            double rata2Responden = (double) total / jmlPertanyaan;
            System.out.println("Responden " + (i + 1) + " : " + rata2Responden);
        }
        System.out.println();

        System.out.println("Rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < jmlPertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jmlResponden; i++) {
                total += hasilSurvei[i][j];
            }
            double rata2Pertanyaan = (double) total / jmlResponden;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rata2Pertanyaan);
        }
        System.out.println();

        int totalKeseluruhan = 0;
        for (int i = 0; i < jmlResponden; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.println("Rata-rata keseluruhan : " + rataRataKeseluruhan);

        scanner.close();
    }
}
