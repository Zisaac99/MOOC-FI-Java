import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(8);
        numbers2.add(3);
        numbers2.add(7);
        System.out.println(numbers2);
        Collections.sort(numbers2);
        System.out.println(numbers2);
    }
}