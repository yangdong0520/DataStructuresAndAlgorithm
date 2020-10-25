package 选择排序;

/**
 * @Author 杨栋
 * @Date 2020/10/17 11:32
 */

public class SelectionSort {
    /**
     * 表现最稳定的排序算法之一，因为无论什么数据进去都是 O(n2) 的时间复杂度
     * 原理：它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕。
     */
    public int [] selectionSort(int [] array){
        if(array.length == 0){
            return array;
        }
        for (int i=0; i<array.length; i++){
            int minIndex = i;
            for (int j=i; j<array.length;j++){
                if(array[j] < array[minIndex]){ // 找到最小的数 
                    minIndex = j; //保存最小数字的索引
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
