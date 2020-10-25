import 插入排序.InsertionSort;

import java.util.Arrays;

/**
 * @,Author 杨栋
 * @Date 2020/10/17 12:20
 */

public class Test {
    public static void main(String[] args) {
        int [] array = new int []{5,8,9,12,6};
        InsertionSort sort = new InsertionSort();
        int [] re =sort.insertionSort(array);
        System.out.println(Arrays.toString(re));
    }
    

}
