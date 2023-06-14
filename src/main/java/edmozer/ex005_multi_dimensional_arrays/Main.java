package edmozer.ex005_multi_dimensional_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] numbers = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers));
        //for multi dimensional arrays use deepToString
    }
}