package 날짜계산;
import java.util.Scanner;

public class baekjoon1476 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        if(E == 15) E = 0;
        int S = scanner.nextInt();
        int M = scanner.nextInt();
        if(M == 19) M = 0;

        int answer = S;
        while(true){
            if(answer % 15 == E && answer % 19 == M){
                System.out.println(answer);
                break;
            }
            answer += 28;
        }

        scanner.close();
    }
}
