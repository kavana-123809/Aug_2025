package Lab4;

import java.util.*;

public class Lab4_4 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>(Arrays.asList("bat", "ball", "bottle", "bag"));

        Collections.sort(products);

        System.out.println("Sorted Product Names:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}



