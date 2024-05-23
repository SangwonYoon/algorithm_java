package 빌런호석;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon22251 {

    static ArrayList<ArrayList<Boolean>> displayInfo = new ArrayList<>(){{
        add(new ArrayList<Boolean>(Arrays.asList(true, true, true, false, true, true, true)));
        add(new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false)));
        add(new ArrayList<Boolean>(Arrays.asList(true, false, true, true, true, false, true)));
        add(new ArrayList<Boolean>(Arrays.asList(true, false, true, true, false, true, true)));
        add(new ArrayList<Boolean>(Arrays.asList(false, true, true, true, false, true, false)));
        add(new ArrayList<Boolean>(Arrays.asList(true, true, false, true, false, true, true)));
        add(new ArrayList<Boolean>(Arrays.asList(true, true, false, true, true, true, true)));
        add(new ArrayList<Boolean>(Arrays.asList(true, false, true, false, false, true, false)));
        add(new ArrayList<Boolean>(Arrays.asList(true, true, true, true, true, true, true)));
        add(new ArrayList<Boolean>(Arrays.asList(true, true, true, true, false, true, true)));
    }};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String strX = itos(X, K);
        int[] nums = new int[K];
        for(int i = 0; i < K; i++){
            int n = strX.charAt(i) - '0';
            nums[i] = n;
        }

        int result = -1;
        
        for(int floor = 1; floor <= N; floor++){
            int totalDiff = 0;

            String strFloor = itos(floor, K);
            for(int digit = 0; digit < K; digit++){
                int num1 = strFloor.charAt(digit) - '0';
                int num2 = nums[digit];
                totalDiff += getDiff(num1, num2);
            }

            if(totalDiff <= P){
                result += 1;
            }
        }

        System.out.println(result);
    }

    public static int getDiff(int num1, int num2){
        ArrayList<Boolean> display1 = displayInfo.get(num1);
        ArrayList<Boolean> display2 = displayInfo.get(num2);

        int diff = 0;
        for(int i = 0; i < 7; i++){
            if(display1.get(i) != display2.get(i)){
                diff += 1;
            }
        }
        return diff;
    }

    public static String itos(int num, int K){
        String strNum = num + "";
        if(strNum.length() < K){
            strNum = "0".repeat(K-strNum.length()) + strNum;
        }
        return strNum;
    }
}
