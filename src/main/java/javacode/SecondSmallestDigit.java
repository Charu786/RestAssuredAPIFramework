package javacode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondSmallestDigit {
    public static void main (String[] args) {
        String str = "claude2403edualc";
        Set<Integer> digits = new TreeSet<>();

        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                digits.add(c-'0');
            }
        }
        List<Integer> list = new ArrayList<>(digits);
        if(list.size()>=2) {
            System.out.println("Second smallest digit: " + list.get(1));
        }else{
            System.out.println("No second smallest digit");
        }
    }
}
