import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    
    public static int n, k;
    public static int[] num = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        k = sc.nextInt();
        
        for(int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        
        int ans = -1;

        // 모든 쌍에 대해서 터질 수 있는 폭탄을 찾고
        // 그 중 번호가 최대인 값을 찾습니다.
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++) {
                // 거리가 k를 초과하는 경우 넘어갑니다.
                if(j - i > k)
                    break;
                
                // 두 폭탄의 번호가 다를 경우 터지지 않습니다.
                if(num[i] != num[j])
                    continue;
                
                ans = Math.max(ans, num[i]);
            }
        
        System.out.print(ans);
    }
}