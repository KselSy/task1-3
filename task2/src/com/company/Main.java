package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(boxSeq(5));
        /*Проверка четвёртого задания
        int[] a = {3,3,-2,408,3,3};
        a = cumulativeSum(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
    }
    public static String repeat(String a, int b){
        int length = a.length();
        String answers = "";
        for (int i = 0; i < length; i++){
            for (int j = 0; j < b; j++){
                answers += a.charAt(i);
            }
        }
        return answers;
    }
    public static int differenceMaxMin(int[] a){
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i]<min){min = a[i];}
            if (a[i]>max){max = a[i];}
        }
        return max-min;
    }
    public static boolean isAvgWhole(int[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        double avg = sum/(a.length);
        if((int)avg < avg){
            return false;
        }
        return true;
    }
    public static int[] cumulativeSum(int[] a){
        for (int i = a.length-1; i>=0 ; i--){
            for (int j = i-1; j>=0; j--){
                a[i] += a[j];
            }
        }
        return a;
    }
    public static int getDecimalPlaces(String a){
        if (a.indexOf(".")>0){
            return a.length()-a.indexOf(".")-1;
        }
        return 0;
    }
    public static int Fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i<n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static boolean isValid(String a){
        return a.length()-a.replaceAll("[0-9]", "").length() == a.length() && a.length()==5;
    }
    public static boolean isStrangePair(String a, String b){
        if(a.length() == 0 && b.length() ==0){
            return true;
        }
        if(a.length() != 0 && b.length() ==0 || a.length() == 0 && b.length() !=0){
            return false;
        }
        if(a.charAt(0) == b.charAt(b.length()-1) && b.charAt(0) == a.charAt(a.length()-1)){
            return true;
        }
        return false;
    }
    public static boolean isPrefix(String a, String b){
        return a.startsWith(b.replace("-",""));
    }
    public static boolean isSuffix(String a, String b){
        return a.endsWith(b.replace("-",""));
    }
    public static int boxSeq(int a){
        int sum = 0;
        for (int i = 0; i < a; i++){
            if (i%2==0) {sum += 3;}
            else {sum -=1;}
        }
        return sum;
    }
}
