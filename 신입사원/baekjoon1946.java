package 신입사원;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Man{
    Integer paper_rank;
    Integer interview_rank;

    public Man(int paper_rank, int interview_rank){
        this.paper_rank = paper_rank;
        this.interview_rank = interview_rank;
    }
}

public class baekjoon1946 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++){
            int N = scanner.nextInt();
            ArrayList<Man> rank = new ArrayList<>();
            for(int j = 0; j < N; j++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Man temp = new Man(a,b);
                rank.add(temp);
            }
            Collections.sort(rank, new Comparator<Man>(){
                @Override
                public int compare(Man a, Man b){
                    return a.paper_rank.compareTo(b.paper_rank);
                }
            });
            int answer = 1;
            int highest = rank.get(0).interview_rank;
            for(int j = 0; j < N; j++){
                if(highest > rank.get(j).interview_rank){
                    highest = rank.get(j).interview_rank;
                    answer++;
                }
            }
            System.out.println(answer);
        }

        scanner.close();
    }
}
