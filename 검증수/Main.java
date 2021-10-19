package 검증수;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int total = 0;
        
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            total += Math.pow(scanner.nextInt(),2);
        }

        System.out.println(total % 10);

        scanner.close();
    }
}
