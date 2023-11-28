import java.util.Scanner;

public class Main {
    public static int x, y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        x = sc.nextInt();
        y = sc.nextInt();

        int ans = 0;

        // 각 숫자에 대해 
        // 흥미로운 숫자인지 아닌지 여부를 판단합니다.
        for(int i = x; i <= y; i++) {
            // digit배열을 만들어 각 자리 숫자의 개수를 저장합니다.
            // allDigits에는 총 자릿수의 개수를 저장합니다.
            int num = i;
            int[] digit = new int[10];
            int allDigits = 0;
            while(num > 0) {
                digit[num % 10]++;
                allDigits++;
                num /= 10;
            }
            
            // intersting : i가 흥미로운 숫자이면 true, 아니면 false
            boolean interesting = false;
            
            // 흥미로운 숫자가 되기 위해서는,
            // 숫자 하나만 allDigits - 1회 등장해야 합니다.
            for(int j = 0; j < 10; j++)
                if(digit[j] == allDigits - 1)
                    interesting = true;
            
            if(interesting)
                ans++;
        }
        
        System.out.print(ans);
    }
}