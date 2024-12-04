import java.util.Scanner;

public class Halloumi_Boxes {
//    PROBLEM LINK: https://codeforces.com/problemset/problem/1903/A

    public static boolean isSorted(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<arr[i-1])return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr =new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            if(isSorted(arr)||k>1) System.out.println("YES");
            else System.out.println("NO");
        }

    }

}

