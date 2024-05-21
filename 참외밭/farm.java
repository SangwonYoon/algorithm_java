package 참외밭;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class farm {
    public static void main(String[] args) throws IOException{
        List<Integer> direction_order = new ArrayList<>(Arrays.asList(4, 2, 3, 1));
        int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}}; // {dx, dy}

        // Scanner scanner = new Scanner(System.in);
        // int K = Integer.parseInt(scanner.nextLine());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());        
        int[][] edges = new int[6][2];
        for(int i = 0; i < 6; i++){
            int[] edge = new int[2];
            st = new StringTokenizer(br.readLine());
            edge[0] = Integer.parseInt(st.nextToken());
            edge[1] = Integer.parseInt(st.nextToken());
            edges[i] = edge;
        }

        int d_order = direction_order.indexOf(edges[0][0]);
        ArrayList<int[]> positions = new ArrayList<>();
        int[] position = {0, 0};
        positions.add(Arrays.copyOf(position, 2));
        int outIndex = 0;
        for(int i = 0; i < 6; i++){
            int temp_d_order = direction_order.indexOf(edges[i][0]);
            if(d_order != temp_d_order){
                outIndex = i;
            }
            d_order = (temp_d_order+1) % 4;
            int[] direction = directions[edges[i][0]-1];
            int dx = direction[0] * edges[i][1];
            int dy = direction[1] * edges[i][1];
            if(i != 5){
                position[0] += dx;
                position[1] += dy;
                positions.add(Arrays.copyOf(position, 2));
            }
        }

        int[] in1 = positions.get(modulo(outIndex-1, 6));
        int[] in2 = positions.get(modulo(outIndex+1, 6));
        int[] out1 = positions.get(modulo(outIndex-2, 6));
        int[] out2 = positions.get(modulo(outIndex+2, 6));

        int area = getArea(out1, out2) - getArea(in1, in2);
        System.out.println(K * area);
    }

    public static int getArea(int[] s1, int[] s2){
        int x1 = s1[0];
        int y1 = s1[1];
        int x2 = s2[0];
        int y2 = s2[1];

        int area = Math.abs(x1-x2) * Math.abs(y1-y2);
        return area;
    }

    public static int modulo(int numerator, int denominator){
        return ((numerator % denominator) + denominator) % denominator;
    }
}
