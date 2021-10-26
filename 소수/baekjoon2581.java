package 소수;
import java.util.Scanner;

public class baekjoon2581 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int first = -1;
        int total = 0;
        for(int i = M; i <= N; i++){
            boolean flag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(i == 1){
                flag = false;
            }
            if(flag){
                if(first == -1){
                    first = i;
                }
                total += i;
            }
        }

        if(total != 0) System.out.println(total);
        System.out.println(first);

        scanner.close();
    }
}
