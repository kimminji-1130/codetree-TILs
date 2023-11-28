import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100;

    public static int n;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];
    
    // 삼각형의 넓이에 2를 곱한 값을 반환합니다.
    public static int area(int i, int j, int k) {
        return Math.abs((x[i] * y[j] + x[j] * y[k] + x[k] * y[i]) - 
                        (x[j] * y[i] + x[k] * y[j] + x[i] * y[k]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 3개의 점을 모두 골라보면서
        // 조건을 만족하는 경우 중
        // 최대 넓이를 계산합니다.
        int maxArea = 0;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++)
                    // x값이 같은 쌍이 있으며, y값 역시 같은 쌍이 있는 경우에만
                    // 최대 넓이를 계산합니다.
                    if((x[i] == x[j] || x[i] == x[k] || x[j] == x[k]) &&
                       (y[i] == y[j] || y[i] == y[k] || y[j] == y[k]))
                        maxArea = Math.max(maxArea, area(i, j, k));
        
        System.out.println(maxArea);
    }
}