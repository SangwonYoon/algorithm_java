package 덱;
import java.util.Scanner;
import java.util.ArrayList;

public class deque{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int N = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < N; i++){
            String inst[] = scanner.nextLine().split(" ");
            if (inst[0].equals("push_front")){
                arr.add(0,inst[1]);
            }
            else if(inst[0].equals("push_back")){
                arr.add(inst[1]);
            }
            else if(inst[0].equals("pop_front")){
                if(arr.size() != 0){
                    System.out.println(arr.get(0));
                    arr.remove(0);
                }
                else{
                    System.out.println("-1");
                }
            }
            else if(inst[0].equals("pop_back")){
                if(arr.size() != 0){
                    System.out.println(arr.get(arr.size()-1));
                    arr.remove(arr.size()-1);
                }
                else{
                    System.out.println("-1");
                }
            }
            else if(inst[0].equals("size")){
                System.out.println(arr.size());
            }
            else if(inst[0].equals("empty")){
                if (arr.size() == 0){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else if(inst[0].equals("front")){
                if(arr.size() != 0){
                    System.out.println(arr.get(0));
                }
                else{
                    System.out.println("-1");
                }
            }
            else if(inst[0].equals("back")){
                if(arr.size() != 0){
                    System.out.println(arr.get(arr.size()-1));
                }
                else{
                    System.out.println("-1");
                }
            }
        }
        scanner.close();
    }
}