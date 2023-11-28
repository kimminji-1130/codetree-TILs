import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 1000;
    public static final int MAX_N = 100;
    
    public static int n;
    public static int[] l = new int[MAX_N];
    public static int[] r = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        
        int ans = 0;

        // 뺄 직원을 정합니다.
        for(int i = 0; i < n; i++) {
            // i번 직원의 구간을 제외한 나머지 구간에서
            // 운행 되고 있는 시간을 구합니다.
            
            int[] count = new int[MAX_NUM];
            
            for(int j = 0; j < n; j++) {
                // i번째 점은 제외합니다.
                if(j == i) continue;
                
                // 모든 구간을 카운팅합니다.
                for(int k = l[j]; k < r[j]; k++)
                    count[k]++;
            }
            
            int time = 0;
            
            for(int j = 1; j < MAX_NUM; j++) {
                if(count[j] > 0) time++;
            }

            // 운행 되고 있는 시간 중 최댓값을 구합니다.
            ans = Math.max(ans, time);
        }

        System.out.print(ans);
        
    }
}