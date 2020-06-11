package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(abcmath(42,5,10));
    }
    public static int remainder(int a, int b){
        return a-a/b;
    }
    public static double triArea(int a, int b){
        return a*b/2;
    }
    public static int animals(int a, int b, int c){
        return 2*a+4*b+4*c;
    }
    public static boolean profitableGamble(double a, double b, double c){
        if (1*(a*b-c)>0)
            return true;
        return false;
    }
    public static String operation(int a, int b, int c){
        if (a == b + c){
            if (a == b * c)
                return "multiply or added";
            return "added";
        }
        if (a == b - c) {
            if (a == b / c)
                return "divided or subtracted";
            return "subtracted";
        }
        if (a == b * c)
            return "multiply";
        if (a == b / c)
            return "divided";
        return "none";
    }
    public static int ctoa(char a){
        return a;
    }
    public static int addUpTo(int a){
        int sum = 0;
        for (int i = 0; i <= a; i++){
             sum += i;
        }
        return sum;
    }
    public static int nextEdge(int a, int b){
        return a+b-1;
    }
    public static int sumofCubes(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i]*a[i]*a[i];
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c){
        for (int i = 0; i<b; i++){
            a += a;
        }
        if (remainder(a,c)==0){
            return true;
        }
        return false;
    }
}
