package 도서관;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon1461 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        ArrayList<Integer> books_pos = new ArrayList<>();
        ArrayList<Integer> books_neg = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int book = Integer.parseInt(st.nextToken());
            if(book > 0){
                books_pos.add(book);
            } else{
                books_neg.add(book);
            }
        }

        Collections.sort(books_pos, Collections.reverseOrder());
        Collections.sort(books_neg);

        int result = 0;
        int max_dist;
        if(!books_pos.isEmpty() && !books_neg.isEmpty()){
            max_dist = Math.max(books_pos.get(0), books_neg.get(0)*(-1));
        } else if(books_pos.isEmpty()){
            max_dist = books_neg.get(0)*(-1);
        } else{
            max_dist = books_pos.get(0);
        }

        int idx = 0;
        while(idx < books_pos.size()){
            int temp_dist = books_pos.get(idx);
            result += temp_dist * 2;
            idx += M;
        }

        idx = 0;
        while(idx < books_neg.size()){
            int temp_dist = books_neg.get(idx) * (-1);
            result += temp_dist * 2;
            idx += M;
        }

        System.out.println(result-max_dist);
    }
}
