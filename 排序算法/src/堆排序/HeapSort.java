package 堆排序;

/**
 * @Author 杨栋
 * @Date 2020/10/24 20:23
 */

public class HeapSort {
    
    public static int[] heapSort(int[] array){
        
        if (array.length <1){
            return array;
        }
        // 1. 构建一个最大堆
        buildMaxHeap(array);
        //2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
        int len = array.length;
        while(len > 0){
            swap(array,0,len-1);
            len--;
            adjustHeap(array,0);
            
        }
        return array;
    }
    
    // 构建最大堆
    public static void buildMaxHeap(int[] array){
        // 从最后一个非叶子节点开始向上构造最大堆
        for (int i=array.length/2-1;i >=0; i--){
            adjustHeap(array,i);
        }
    }
    
    // 堆筛选的过程
    public static void adjustHeap(int[] array, int i){
        int maxIndex =i;
        // 如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if(i*2 < array.length && array[i*2] > array[maxIndex]){
            maxIndex = i*2;
        }
        // 如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if(i*2+1 <array.length && array[i*2+1] > array[maxIndex]){
            maxIndex = i*2+1;
        }
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if(maxIndex != i){
            swap(array,maxIndex,i);
            adjustHeap(array,maxIndex);
        }
        
    }
    
    // 交换元素位置
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
   
}
