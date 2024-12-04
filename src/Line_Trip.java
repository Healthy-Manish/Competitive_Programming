import java.util.Scanner;

public class Line_Trip {
//      PROBLEM LINK: https://codeforces.com/problemset/problem/1901/A

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int arr[]=new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i]= sc.nextInt();
                }
               int maxi= Integer.MIN_VALUE;
                maxi = Math.max(maxi,arr[0]-0);
                for ( int i = 1; i <n ; i++) {
                    maxi = Math.max(maxi,arr[i]-arr[i-1]);
                }
                maxi = Math.max(maxi,2*(x-arr[n-1]));
                System.out.println(maxi);
            }

        }

}
