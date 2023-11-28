import java.util.Scanner;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static final int MAX_N = 100;
    
    public static int n;
    public static int[] a = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        // 인접하지 않은 모든 쌍을 다 잡아봅니다.
        int ans = INT_MIN;
        for(int i = 0; i < n; i++)
            for(int j = i + 2; j < n; j++)
                if(ans < a[i] + a[j])
                    ans = a[i] + a[j];
        
        System.out.print(ans);
        
    }
}