import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int a = sc.nextInt();

		int[] Na=new int[N];
		int cnt=0;
		int MAX=0;
		for(int i=0;i<N;i++){
			Na[i]=sc.nextInt();
			if(Na[i]>a)
				cnt++;
			else
				cnt=1;
			if(cnt>MAX)
				MAX=cnt;
		}

		System.out.print(MAX-1);				
	}
}