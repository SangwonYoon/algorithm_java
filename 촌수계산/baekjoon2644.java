package 촌수계산;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class baekjoon2644 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int person1 = Integer.parseInt(st.nextToken()) - 1;
        int person2 = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        ArrayList<Integer> visited = new ArrayList<>(
            Collections.nCopies(n, -1)
        );
        Queue<Integer> q = new LinkedList<>();
        q.offer(person1);
        visited.set(person1, 0);

        while(!q.isEmpty() && visited.get(person2) == -1){
            int p = q.poll();
            int dist = visited.get(p);
            ArrayList<Integer> neighbors = graph.get(p);
            for(int neighbor: neighbors){
                if(visited.get(neighbor) == -1){
                    visited.set(neighbor, dist+1);
                    q.offer(neighbor);
                }
            }
        }

        System.out.println(visited.get(person2));
    }
}
