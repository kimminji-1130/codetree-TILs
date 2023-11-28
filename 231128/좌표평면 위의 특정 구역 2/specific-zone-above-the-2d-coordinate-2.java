import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100;
    public static final int MAX_NUM = 40000;

    public static int n = MAX_N;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = INT_MAX;

        // 빼야하는 점의 위치를 정합니다.
        for(int i = 0; i < n; i++) {
            // i번 점을 제외한 나머지 점들을 포함하기 위한
            // 직사각형의 최소 넓이를 구합니다.

            // 직사각형의 최소 넓이를 구하기 위해서는,
            // 남은 점들의 x좌표 중 최소, 최대
            //          y좌표 중 최소 최대를 구해야 합니다.
            int minX = MAX_NUM, maxX = 1;
            int minY = MAX_NUM, maxY = 1;
            for(int j = 0; j < n; j++) {
                // i번째 점은 제외합니다.
                if(j == i) continue;

                minX = Math.min(minX, x[j]);
                maxX = Math.max(maxX, x[j]);
                minY = Math.min(minY, y[j]);
                maxY = Math.max(maxY, y[j]);
            }

            // 가능한 직사각형 넓이 중 최솟값을 기록합니다.
            ans = Math.min(ans, (maxX - minX) * (maxY - minY));
        }
        
        System.out.println(ans);
    }
}