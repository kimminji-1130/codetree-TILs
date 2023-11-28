import java.util.Scanner;

public class Main {
    public static final int MAX_A = 100;
    public static final int MAX_N = 10;
    
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
        
        // 3개의 선분을 모두 골라보면서
        // 모두 겹쳐지지 않도록 하는 가짓수를 구합니다.
        int ans = 0;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++) {
                    // i, j, k번 선분을 제외했을 때
                    // 모든 선분이 겹치지 않으면 정답을 1 추가합니다.
                    
                    // overlap : 모든 선분이 겹치지 않으면 false
                    boolean overlap = false;
                    int[] arr = new int[MAX_A + 1];
                    
                    for(int x = 0; x < n; x++) {
                        // 제외한 3개의 선분이면 넘어갑니다.
                        if(x == i || x == j || x == k)
                            continue;
                        
                        for(int y = l[x]; y <= r[x]; y++)
                            arr[y]++;
                    }
                    
                    for(int x = 0; x <= MAX_A; x++)
                        if(arr[x] > 1)
                            overlap = true;
                    
                    if(overlap == false)
                        ans++;
                }
        
        System.out.print(ans);
    }
}