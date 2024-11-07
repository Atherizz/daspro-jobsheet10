import java.util.Scanner;

public class BioskopWithScanner25 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris,kolom;
        String nama,next;
        String[][] penonton = new String[4][2];
    
        System.out.print("Apakah anda ingin mengakses menu? (y/n) : ");
        String lanjutMenu = sc.next();

        while (lanjutMenu.equalsIgnoreCase("y")) {
         System.out.print("Masukkan pilihan menu! (1/2/3) : ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
            System.out.println("INPUT DATA PENONTON");
            while (true) {
                sc.nextLine();
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = sc.nextInt();

                while (baris < 1 || baris > (penonton.length) || kolom < 1 || kolom > (penonton[0].length) || penonton[baris-1][kolom-1] != null) {
                    System.out.println("BARIS / KOLOM TIDAK TERSEDIA!");
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                }
                
                sc.nextLine();
                penonton[baris-1][kolom-1] = nama;

                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.next();
    
                if (next.equalsIgnoreCase("n")) {
   
                    break;
                }
            }
            break;
            case 2:
            System.out.println("DAFTAR DATA PENONTON");
            for(int i = 0; i < penonton.length; i++) {
                System.out.println("baris ke  " + (i+1) + " : " );
                for(int j = 0; j < penonton[0].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.printf("*** \t ");
                    }else{
                        System.out.printf("%s \t ", penonton[i][j]);
                    }
                }
                System.out.println();
            }
            break;
            case 3:
            break;
            default:
            System.out.println("Masukkan pilihan 1/2/3 saja!");
            break;
        }

        System.out.print("Apakah anda ingin mengakses menu? (y/n)");
        lanjutMenu = sc.next();
    }
        
        
    }
}
