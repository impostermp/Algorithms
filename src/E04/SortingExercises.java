package src.E04;

import java.nio.charset.Charset;
import java.util.HashSet;

public class SortingExercises {
    public static void main(String[] args) {
        int[] arr = new int[]{9,3,2,2,10,8};
        int num = 20;
        System.out.println(sortByQuadraticNotation(arr, num));
    }

public static boolean sortByQuadraticNotation(int[] myArr, int value){
    for(int i=0;i<myArr.length-1;i++){
        for(int j=i+1;j<myArr.length;j++){
            if(myArr[i]+myArr[j]==value){
                return true;
            }
        }
    }
    return false;
    }

    public static boolean findSumLinear(int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length - 1;
    
        while (left < right) {
            int sum = arr[left] + arr[right];
    
            if (sum == targetSum) {
                return true;
            } else if (sum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static boolean areAnagrams(String word1, String word2){
        if (word1.length()!=word2.length()){
            return false;
        }

        // add word1 chars to HashSet
        HashSet<Character> mySet = new HashSet<>();
        for(char c : word1.toCharArray()){
            mySet.add(c);
        }
        // check if chars of word2 is in word1
        for(char d : word2.toCharArray()){
            if (!mySet.remove(d)){
                // char is not present in hashset, so it is not an anagram.
                return false;
            }
        }
        // is an anagram
        return true;
    }
}
