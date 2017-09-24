
//Program shows how to create key value pairs in Hash map
//and use a for loop to add these key value pairs in map


import java.util.HashMap;
import java.util.Map;

public class hash_map {


    public static void main(String[] args) {

        Map<Integer,String> fruits=new HashMap<>();
        int[] keys = {1,3,5,7,9};
        String[] values={"apples","oranges","lemons","peach","gumba"};

        for (int i=0; i<keys.length; i++){
            fruits.put(keys[i],values[i]);
        }


        System.out.print(fruits);

        System.out.print(fruits.get(9));

    }
}
