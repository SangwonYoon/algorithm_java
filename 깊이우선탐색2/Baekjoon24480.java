package 깊이우선탐색2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon24480 {

    static int turn = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken()) - 1;

        ArrayList<ArrayList<Integer>> adjacent = new ArrayList<>();
        for(int i = 0; i < N; i++){
            adjacent.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken()) - 1;
            int node2 = Integer.parseInt(st.nextToken()) - 1;

            adjacent.get(node1).add(node2);
            adjacent.get(node2).add(node1);
        }

        for(int i = 0; i < N; i++){
            Collections.sort(adjacent.get(i), Collections.reverseOrder());
        }

        ArrayList<Integer> visited = new ArrayList<>(
            Collections.nCopies(N, 0)
        );
        dfs(adjacent, visited, R);
        for(int t: visited){
            System.out.println(t);
        }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adjacent, ArrayList<Integer> visited, int node){
        visited.set(node, turn);
        turn += 1;
        ArrayList<Integer> neighbors = adjacent.get(node);
        for(int neighbor: neighbors){
            if(visited.get(neighbor) == 0){
                dfs(adjacent, visited, neighbor);
            }
        }
    }
}
