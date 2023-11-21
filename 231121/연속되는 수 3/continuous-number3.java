import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    
    public static int n;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // 연속하여 동일한 부호의 숫자가 나오는 횟수를 구해보며,
        // 그 중 최댓값을 갱신합니다.
        int ans = 0, cnt = 0;
        for(int i = 0; i < n; i++) {
            // Case 1
            if(i >= 1 && arr[i] * arr[i - 1] > 0)
                cnt++;
            // Case 2
            else
                cnt = 1;
            
            ans = Math.max(ans, cnt);
        }
        
        System.out.print(ans);
    }
}