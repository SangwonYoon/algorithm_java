package 삼십; // 30
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon10610 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int total = 0;
        boolean flag = false;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < num.length(); i++){
            int temp = Integer.parseInt(num.charAt(i) + "");
            nums.add(temp);
            if (temp == 0){
                flag = true;
            }
            total += temp;
        }
        if (total % 3 != 0){
            flag = false;
        }
        if(!flag) {
            System.out.println(-1);
            System.exit(0);
        }

        Collections.sort(nums, Collections.reverseOrder());
        String answer = "";
        for(int i = 0; i < nums.size(); i++){
            answer += nums.get(i) + "";
        }
        System.out.println(answer);

        scanner.close();
    }
}
