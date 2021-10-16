package 최댓값;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[9];

        for(int i = 0; i < 9; i++){
            intArr[i] = scanner.nextInt();
        }

        int max = -1;
        int idx = -1;
        for(int i = 0; i < 9; i++){
            if(intArr[i] > max){
                max = intArr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);

        scanner.close();
    }
}
