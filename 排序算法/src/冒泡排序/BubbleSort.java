package 冒泡排序;
public class BubbleSort {
    /**
     * 
     * 
     * @param array
     * @return
     *     比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     *
     *     对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     *
     *     针对所有的元素重复以上的步骤，除了最后一个；
     *
     *     重复步骤1~3，直到排序完成。
     *     最佳情况：T(n) = O(n) 最差情况：T(n) = O(n2) 平均情况：T(n) = O(n2)
     *     一共需N-1趟排序，没I趟的排序次数为N-I
     */
    public int[] bubbleSort(int[] array){
        if(array.length == 0){
            return array;
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1;j++){
                if(array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
