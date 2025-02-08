package Binary_search;

import java.util.Scanner;

public class sqaure_root {

    public static int mySqrt(int x) {

        long low = 0;
        long high = x;
        while (low<=high){
            long mid = low +(high-low)/2;
            if (mid*mid==(long)x)return (int)mid;
            else if (mid*mid >(long)x ) high=mid-1;
            else if (mid*mid<x)low = mid+1;
        }
        return (int)high;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans=mySqrt(x);
        System.out.println(ans);

    }
}