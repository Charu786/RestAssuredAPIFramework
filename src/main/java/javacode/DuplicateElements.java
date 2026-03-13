package javacode;

import java.util.HashSet;

public class DuplicateElements {

    public static void main (String[] args) {
        int arr[] = {1,2,3,4,2,5,3};
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(set.add(num) == false) {
                System.out.println(num);
            }
        }
    }

}
