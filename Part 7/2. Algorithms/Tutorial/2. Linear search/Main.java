import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = {1,6,7,8,3,4,5,6};
        System.out.println(LinearSearch(arr,6));
    }

    public static int LinearSearch(int[] array, int searched){
        for(int i = 0; i < array.length; i++){
            if(array[i] == searched){
                return i;
            }
        }
        return -1;
    }
}