package FourSquares;
import java.util.Scanner;
import java.util.ArrayList;

public class baekjoon17626 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);
        for(int i = 2; i <= n; i++){
            if((int)Math.sqrt(i) * (int)Math.sqrt(i) == i){
                memo.add(1);
                continue;
            }
            int min = 4;
            for(int j = 1; j*j < i; j++){
                int temp = memo.get(i-j*j);
                if(temp == 1){
                    min = 1;
                    break;
                } else{
                    min = min > temp ? temp : min;
                }
            }
            memo.add(min + 1);
        }
        System.out.println(memo.get(n));

        scanner.close();
    }
}
