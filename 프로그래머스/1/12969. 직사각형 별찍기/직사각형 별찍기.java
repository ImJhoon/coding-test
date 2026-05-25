import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {
        StringBuilder sb = new StringBuilder("");
        String n_m = bf.readLine();
        StringTokenizer st = new StringTokenizer(n_m); 
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}