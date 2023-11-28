import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100;

    public static int n;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];
    
    // 두 점 사이의 거리의 제곱 값을 반환합니다.
    public static int dist(int i, int j) {
        return (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 모든 쌍에 대해서 거리 제곱값을 계산하여
        // 그 중 최솟값을 찾습니다.   
        int minDist = INT_MAX;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                minDist = Math.min(minDist, dist(i, j));
        
        System.out.println(minDist);
    }
}