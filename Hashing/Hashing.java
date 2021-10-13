package Hashing;
import java.util.Scanner;

public class Hashing{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String str = scanner.next();

        long total = 0;
        long m = 1;

        for(int i = 0; i < str.length(); i++){
            total += ((str.charAt(i) - 96) * m) % 1234567891;
            total %= 1234567891;
            m *= 31;
            m %= 1234567891;
        }

        System.out.println(total%1234567891);
        scanner.close();
    }
}