import java.util.Scanner;

public class Siakad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int mhs = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int matkul = sc.nextInt();

        int[][] nilai = new int[mhs][matkul];

        for (int i = 0; i < nilai.length;i++) {
            System.out.println("Input nilai mahasiswa ke- " + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[0].length;j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/matkul);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for(int j = 0; j < matkul; j++) {
            double totalPerMatkul = 0;
            for(int i = 0; i < mhs;i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul / mhs);
        }

    }
    
}