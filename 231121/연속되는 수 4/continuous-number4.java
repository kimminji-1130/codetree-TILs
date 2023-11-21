import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a+1];
        int[] be = new int[a+1];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int sum=0;
        int num=0;
        for(int i=0;i<a;i++){
            if(b[i]<b[i+1]){
                sum++;
                if(b[i]>b[i+1]) sum=0;
            }
        }
        for(int i=0;i<a;i++){
         if(b[i]>b[i+1]){
                num++;
                if(b[i]<b[i+1]) num=0;
            }
        }
        if(sum>num) System.out.print(sum);
        else if(num>sum) System.out.print(num);
    }
}