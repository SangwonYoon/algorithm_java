package 괄호의값;
import java.util.Scanner;
import java.util.ArrayList;

public class baekjoon2504 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        ArrayList<String> bracket = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            int total = 1;
            boolean flag = false;
            if (input.charAt(i) == '(' || input.charAt(i) == '['){
                bracket.add(input.charAt(i)+"");
            } else if(input.charAt(i) == ')'){
                while(bracket.size() > 0){
                    if(bracket.get(bracket.size()-1).equals("(")){
                        bracket.remove(bracket.size()-1);
                        bracket.add(total*2 + "");
                        flag = true;
                        break;
                    } else if(bracket.get(bracket.size()-1).equals("[")){
                        break;
                    } else{
                        if(total == 1) {
                            total = Integer.parseInt(bracket.get(bracket.size()-1));
                        } else{
                            total += Integer.parseInt(bracket.get(bracket.size()-1));
                        }
                        bracket.remove(bracket.size()-1);
                    }
                }
                if(!flag){
                    System.out.println(0);
                    System.exit(0);
                }
            } else if(input.charAt(i) == ']'){
                while(bracket.size() > 0){
                    if(bracket.get(bracket.size()-1).equals("[")){
                        bracket.remove(bracket.size()-1);
                        bracket.add(total*3+"");
                        flag = true;
                        break;
                    } else if(bracket.get(bracket.size()-1).equals("(")){
                        break;
                    } else{
                        if(total == 1) {
                            total = Integer.parseInt(bracket.get(bracket.size()-1));
                        } else{
                            total += Integer.parseInt(bracket.get(bracket.size()-1));
                        }
                        bracket.remove(bracket.size()-1);
                    }
                }
                if(!flag){
                    System.out.println(0);
                    System.exit(0);
                }
            } else{
                System.out.println(0);
                System.exit(0);
            }
        }
        int answer = 0;
        for(String i : bracket){
            if(i.equals("(") || i.equals(")") || i.equals("[") || i.equals("]")){
                System.out.println(0);
                System.exit(0);
            } else{
                answer += Integer.parseInt(i);
            }
        }
        System.out.println(answer);

        scanner.close();
    }
}
