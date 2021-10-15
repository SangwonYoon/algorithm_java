package Z;
import java.util.Scanner;

public class z{
    static int total = 0;
    public static int search(int N, int r, int c){
        if(N == 0){
            return total;
        }
        if(r < Math.pow(2,N-1)){
            if(c < Math.pow(2,N-1)){
                return search(N-1,r,c);
            }
            else{
                total += (int)(Math.pow(Math.pow(2,N-1),2));
                return search(N-1,r,(int)(c-Math.pow(2,N-1)));
            }
        }
        else{
            if(c < Math.pow(2,N-1)){
                total += (int)(Math.pow(Math.pow(2,N-1),2))*2;
                return search(N-1,(int)(r-Math.pow(2,N-1)),c);
            }
            else{
                total += (int)(Math.pow(Math.pow(2,N-1),2))*3;
                return search(N-1,(int)(r-Math.pow(2,N-1)),(int)(c-Math.pow(2,N-1)));
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(search(N,r,c));

        scanner.close();
    }


}
