package 插入排序;

/**
 * @Author 杨栋
 * @Date 2020/10/17 11:59
 */

public class InsertionSort {
    /**
     * 插入排序都采用 in-place 在数组上实现。
     *     1. 从第一个元素开始，该元素可以认为已经被排序；
     *
     *     2. 取出下一个元素，在已经排序的元素序列中从后向前扫描；
     *
     *     3. 如果该元素（已排序）大于新元素，将该元素移到下一位置；
     *
     *     4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
     *
     *     5. 将新元素插入到该位置后；
     *
     *     6. 重复步骤2~5。
     *     
     *     最佳情况：T(n) = O(n) 最坏情况：T(n) = O(n2) 平均情况：T(n) = O(n2)
     *
     */     
    public int [] insertionSort(int[] array){
        if(array.length == 0){
            return array;
        }
        for (int i=0; i<array.length-1;i++){
            int current = array[i+1];
            int preIndex =i;
           while(preIndex >=0 && current < array[preIndex]){
               array[preIndex+1] = array[preIndex];
               preIndex--;
           }
           array[preIndex+1] = current;
        }
        return array;
        
        
    }
}
