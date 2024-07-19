import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(-1,-51,2,3));
        System.out.println(positive(nums));
    }

    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream().filter(value -> value >= 0).collect(Collectors.toList());
    }
}