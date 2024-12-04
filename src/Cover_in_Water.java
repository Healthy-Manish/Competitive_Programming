import java.util.Scanner;

public class Cover_in_Water {
//  PROBLEM LINK: https://codeforces.com/problemset/problem/1900/A

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s= sc.next();
            int ans = solve(s,n);
            System.out.println(ans);

        }
    }
    public static int solve(String s,int n){
        int empty =0;
        int seq =0;
        for (char c: s.toCharArray()) {
            if (c == '.') {
                seq++;
                empty++;
            } else if (c == '#') seq = 0;
            if (seq == 3) {
               return  2;
            }
        }
        return empty;
    }
}
