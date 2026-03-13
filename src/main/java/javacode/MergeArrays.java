package javacode;

public class MergeArrays {
    public static void main (String[] args) {
        int arr1[] = {5,3,2};
        int arr2[] = {9,0,1};
        int merged[] = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){

            merged[arr1.length+i] = arr2[i];
        }
        for(int num: merged){
            System.out.println(num + " ");
        }
    }
}
