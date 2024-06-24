import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] intArr = {1,5,8,3,22,0};
        String[] strArr = {"b","c","e","a","c"};

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,5,8,3,22,0));
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("b","c","e","a","c"));

        System.out.println(Arrays.toString(intArr));
        sort(intArr);
        System.out.println(Arrays.toString(intArr));

        System.out.println(Arrays.toString(strArr));
        sort(strArr);
        System.out.println(Arrays.toString(strArr));

        System.out.println(intList);
        sortIntegers(intList);
        System.out.println(intList);

        System.out.println(strList);
        sortStrings(strList);
        System.out.println(strList);
        
    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}