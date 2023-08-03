package Collections;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        int [] array = {4,5,6,6,8};

        boolean result = containsDuplicate(array);

        System.out.println("Массив содержит дубликаты? " + result);
    }

    public static boolean containsDuplicate(int [] nums){
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
