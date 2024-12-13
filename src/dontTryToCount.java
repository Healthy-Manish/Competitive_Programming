import java.util.Scanner;

public class dontTryToCount {
// PROBLEM Link: https://codeforces.com/problemset/problem/1881/A

    static int solve(String x,String s){
        StringBuilder sx = new StringBuilder(x);
        for(char a: s.toCharArray()){
            if (sx.indexOf(""+a)==-1)return -1;
        }
        int cnt =0;

        while(true) {
            if (cnt>5)return -1;
            if (sx.indexOf(s) != -1) {
                return cnt;
            }
            cnt++;
            sx.append(sx);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x= sc.next();
            String s = sc.next();
            System.out.println(solve(x,s));
        }
    }
}
