package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int [] nums = {3,8,15,17};

        System.out.println(Arrays.toString(twoSum(nums, 23)));


    }
    private static int [] twoSum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        int [] result = new int[2];  // тут храниться индексы двух чисел
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){       //Проверяем, содержится ли в хэш-таблице map ключ, равный разности target - nums[i]
                result[1] = i;                              //Записываем во второй элемент массива result значение i, текущего индекса
                result[0] = map.get(target - nums[i]);      //Записываем в первый элемент массива result значение, которое соответствует ключу target - nums[i]
                return result;
            }map.put(nums[i], i);
        }
        return result;
    }
}
