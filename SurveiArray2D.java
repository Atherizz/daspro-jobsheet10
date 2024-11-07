import java.util.Scanner;

public class SurveiArray2D {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];
        double[] rataResp = new double[10];
        double[] rataPert = new double[6];
        int totalResp = 0;
        int totalPert = 0;
        int totalPoin = 0;
        double rataTotal;

        System.out.println("DATA RESPONDEN KUISIONER");
        System.out.println("---------------------------");
        System.out.println("-----MASUKKAN ANGKA 1-5-----");

        System.out.println();

        for(int i = 0; i < survey.length;i++) {
            System.out.println("Responden ke " + (i+1));
            for(int j = 0; j < survey[0].length; j++) {
                do {
                System.out.print("Masukkan nilai pertanyaan ke " + (j+1) + " : ");
                survey[i][j] = sc.nextInt(); 
                } while (survey[i][j] < 1 || survey[i][j] > 5);
            }
        }

        for(int i = 0; i < survey.length;i++) {
            for(int j = 0; j < survey[0].length;j++) {
                totalResp += survey[i][j];
            }
            rataResp[i] = (double)totalResp/6;
            System.out.println("rata - rata poin responden ke " + (i+1) + " : " + rataResp[i]);
            totalResp = 0;
        }

        System.out.println();

        for(int i = 0; i < survey[0].length;i++) {
            for(int j = 0; j < survey.length;j++) {
                totalPert += survey[j][i];
            }
            rataPert[i] = (double)totalPert/10;
            System.out.println("rata - rata poin pertanyaan ke " + (i+1) + " : " + rataPert[i]);
            totalPert = 0;
        }

        for(int i = 0; i < survey.length;i++) {
            for(int j = 0; j < survey[0].length;j++) {
                totalPoin+= survey[i][j];
            }
        }

        rataTotal = (double)totalPoin / 60;
        System.out.println("Rata - Rata Total : " + rataTotal);
        
    

    }
}
