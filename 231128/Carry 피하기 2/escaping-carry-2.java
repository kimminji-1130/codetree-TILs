import java.util.Scanner;

public class Main {
    public static int n;
    public static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        str = sc.next();
        
        // 모든 쌍을 다 잡아봅니다.
        int cnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++)
                    if(str.charAt(i) == 'C' && str.charAt(j) == 'O'
                        && str.charAt(k) == 'W')
                        cnt++;
        
        System.out.print(cnt);
    }
}