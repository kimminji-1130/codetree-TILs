import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[][] a1 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a1[i][j] = sc.nextInt();
            }
        }
        int[][]sum = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j] = a[i][j]*a1[i][j];
                System.out.print(sum[i][j]+" ");
            }System.out.println();
        }
    }
}