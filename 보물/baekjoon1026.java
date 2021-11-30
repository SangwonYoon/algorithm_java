package 보물;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon1026 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            A.add(scanner.nextInt());
        }
        for(int i = 0; i < N; i++){
            B.add(scanner.nextInt());
        }
        Collections.sort(A);
        Collections.sort(B);

        int total = 0;
        for(int i = 0; i < N; i++){
            total += A.get(i) * B.get(N-i-1);
        }
        System.out.println(total);

        scanner.close();
    }  
}
