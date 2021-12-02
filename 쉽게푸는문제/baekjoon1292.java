package 쉽게푸는문제;
import java.util.Scanner;
import java.util.ArrayList;

public class baekjoon1292 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        ArrayList<Integer> accumulate = new ArrayList<Integer>();
        int temp = 1;
        int cnt = 1;
        int total = 0;

        for(int i = 0; i < B; i++){
            if(cnt == 0){
                cnt = ++temp;
            }
            total += temp;
            cnt--;
            accumulate.add(total);
        }

        if(A != 1) {
            System.out.println(accumulate.get(B-1) - accumulate.get(A-2));
        } else {
            System.out.println(accumulate.get(B-1));
        }

        scanner.close();
    }
}
