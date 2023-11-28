import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 1003;
    
    public static int n;
    public static int[] a = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        // i번째 방에서 출발했을 경우의 결과를 구해줍니다.
        int ans = INT_MAX;
        for(int i = 0; i < n; i++) {
            int sumDist = 0;
            for(int j = 0; j < n; j++) {
                int dist = (j + n - i) % n;
                sumDist += dist * a[j];
            }
            
            // 가능한 거리의 합 중 최솟값을 구해줍니다.
            ans = Math.min(ans, sumDist);
        }
        
        System.out.print(ans);
    }
}