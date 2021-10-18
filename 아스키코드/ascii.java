package 아스키코드;
import java.util.Scanner;

public class ascii {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        System.out.println(c+0);

        scanner.close();
    }
}
