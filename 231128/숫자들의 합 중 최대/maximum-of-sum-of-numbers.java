import java.util.Scanner;

public class Main {
    public static int x, y;
    
    // 각 자리 숫자의 합을 구하여 반환합니다.
    public static int digitSum(int n) {
        // 한 자리 숫자라면 그 숫자 그대로 반환합니다.
        if(n < 10)
            return n;
        // 두 자리 이상의 숫자라면,
        // 맨 끝자리를 제외한 숫자들의 합을 재귀적으로 호출한 뒤,
        // 그 결과가 마지막 자릿수를 더해 반환합니다.
        else
            return digitSum(n / 10) + (n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        x = sc.nextInt();
        y = sc.nextInt();

        int ans = 0;

        // 각 숫자에 대해 
        // 각 자리 숫자의 합을 구해
        // 그 중 최댓값을 계산합니다.
        for(int i = x; i <= y; i++)
            ans = Math.max(ans, digitSum(i));
        
        System.out.println(ans);
    }
}