package com.company;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        System.out.println(rightTriangle(70,130,110));
	// write your code here
    }
    public static int solution(int a, int b, int c){
        if (b*b-4*a*c == 0)
            return 1;
        if (b*b-4*a*c > 0)
            return 2;
        return 0;
    }
    public static int findZip(String a){
        return a.indexOf("zip",a.indexOf("zip")+1);
    }
    public static boolean checkPerfect(int a){
        int sum = 1;
        for (int i = 2; i < a; i++){
            if (a%i==0){
                sum += i;
            }
        }
        return sum == a;
    }
    public static String flipEndChars(String a){
        if(a.length()>1){
            if (a.charAt(0)!=a.charAt(a.length()-1)){
                String result = a.charAt(a.length()-1)+ a.substring(1,a.length()-1)+a.charAt(0);
                return result;
            }
            else return "Two's a pair";
        }
        return "Incompatible";
    }
    public static boolean isValidHexCode(String a){
        return a.charAt(0) == '#' && a.length()-a.replaceFirst("#","").replaceAll("[0-9a-fA-F]","").length() == a.length();
    }
    public static boolean same(int[] a, int[] b){
        int n1 = 0;
        int n2 =0;
        sort(a);
        sort(b);
        if (a.length>1){
            for (int i = 1; i < a.length; i++){
                if (a[i] !=a[i-1]){
                    n1++;
                }
            }
        }
        else n1 = 1;
        if (b.length>1){
            for (int i = 1; i < b.length; i++){
                if (b[i] != b[i-1]){
                    n2++;
                }
            }
        }
        else n2 = 1;
        return n1==n2;
    }
    public static boolean isKaprekar(int a){
        String b = String.valueOf(a*a);
        String left = "";
        String right = "";
        if(b.length()>1){
            left = b.substring(0,b.length()/2);
            right = b.substring(b.length()/2,b.length());
        }
        else{
            left = "0";
            right = b;
        }
        return a == Integer.valueOf(left) + Integer.valueOf(right);
    }
    public static String longestZero(String a){
        int zero = 0;
        int quantity = 0;
        String result = "";
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == '0'){
                zero ++;
                if (quantity < zero){
                    quantity = zero;
                }
            }
            else zero = 0;
        }
        for (int j = 0; j < quantity; j++){
            result += "0";
        }
        return result;
    }
    public static int nextPrime(int a){
        if(!IsPrime(a)){
            while (!IsPrime(a)){
                a++;
            }
        }
        return a;
    }
    /*Вспомогательная функция*/
    public static boolean IsPrime(int n){
        for(int i = 2 ; i < n ; i++ ){
            if (n % i == 0 && n / i != 1) {
                return false;
            }
        }
        return true;
    }
    public static boolean rightTriangle(int a, int b, int c){
        int[] arr = {a, b, c};
        sort(arr);
        return arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2];
    }
}
