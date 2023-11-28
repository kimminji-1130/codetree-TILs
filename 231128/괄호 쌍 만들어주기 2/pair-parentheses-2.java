import java.util.Scanner;

public class Main {
    public static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        str = sc.next();
        int n = (int) str.length();
        
        // 모든 쌍을 다 잡아봅니다.
        int cnt = 0;
        for(int i = 0; i < n - 1; i++)
            for(int j = i + 1; j < n - 1; j++)
                if(str.charAt(i) == '(' && str.charAt(i + 1) == '('
                    && str.charAt(j) == ')' && str.charAt(j + 1) == ')')
                    cnt++;
        
        System.out.print(cnt);
    }
}