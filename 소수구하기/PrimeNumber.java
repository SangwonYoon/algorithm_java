package 소수구하기;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        boolean flag = true;
        for(int i = M; i <= N; i++){
            if(i == 1){
                continue;
            }
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
            else{
                flag = true;
            }
        }

        scanner.close();
    }
}
