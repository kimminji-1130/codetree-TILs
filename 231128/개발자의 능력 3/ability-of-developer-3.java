import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 6;

    public static int n = MAX_N;
    public static int[] arr = new int[MAX_N];

    public static int diff(int i, int j, int k) {
        int totalSum = 0;
        for(int l = 0; l < n; l++)
            totalSum += arr[l];
        
        // 두 번째 팀원의 합은 전체에서 첫 번째 팀원의 합을 빼주면 됩니다.
        int sum1 = arr[i] + arr[j] + arr[k];
        int sum2 = totalSum - sum1;
        return Math.abs(sum1 - sum2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // 첫 번째 팀원을 만들어줍니다.
        int minDiff = INT_MAX;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++)
                    minDiff = Math.min(minDiff, diff(i, j, k));
        
        System.out.println(minDiff);
    }
}