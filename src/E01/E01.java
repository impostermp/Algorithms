package src.E01;

import java.util.Arrays;

public class E01 {

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    public int sum(int n){
        
    if (n == 0) // base case
        return 0;
    else    
        return n+sum(n-1);  
    }

    public int sumSquares(int n){
        // base case
        if (n<=0){
            return 0;
        }
        if (n%2==0){
            return n*n + sumSquares(n-2);
        }
        else {
            return sumSquares(n-1);
        } 
    }
    public static int fib(int n){
        // if n == 1, return 1 else return 0
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
                return 1;
            }
        return fib(n-2) + fib(n-1);
    }

    public boolean linear(String s, char c, int l){
        // returns true if string s with the length l contains char c, otherwise fails
        if (l == 0){
            return false;
        }

        if (s.charAt(l-1) == c){
            return true;
        }
        return linear(s, c, l-1);
    }
    public boolean binarySearch(int arr[],int value){
        // returns true if value is in array, otherwise false the elements in array are sorted
        if (arr.length == 0){
            return false;
        }
    
        if (arr[0] == value){
            return true;
        }

        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
        return binarySearch(newArr, value);
    }
}