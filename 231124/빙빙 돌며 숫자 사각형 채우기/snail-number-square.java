import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 100;
    public static final int DIR_NUM = 4;

    public static int n, m;
    public static int[][] arr = new int[MAX_NUM][MAX_NUM];
    
    public static int[] dx = new int[]{0, 1,  0, -1};
    public static int[] dy = new int[]{1, 0, -1,  0};

    public static int currX = 0, currY = 0;  // 시작은 (0, 0) 입니다.
    public static int dir = 0;               // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: 위쪽  

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        m = sc.nextInt();

        // 처음 시작 위치에 초기값을 적습니다.
        arr[currX][currY] = 1;

        // n*m개의 숫자를 적어야 합니다. 
        for(int i = 2; i <= n * m; i++) { // 숫자 i를 어디에 적을지 결정합니다.
            // 현재 방향 dir를 기준으로 그 다음 위치 값을 계산합니다.
            int nextX = currX + dx[dir], nextY = currY + dy[dir];

            // 더 이상 나아갈 수 없다면
            // 시계방향으로 90'를 회전합니다.
            if(!inRange(nextX, nextY) || arr[nextX][nextY] != 0)
                dir = (dir + 1) % 4;

            // 그 다음 위치로 이동한 다음 배열에 올바른 값을 채워넣습니다.
            currX = currX + dx[dir]; currY = currY + dy[dir];
            arr[currX][currY] = i;
        }
        
        // 출력:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}