package org.jerfan.algorithm.lesson1;


/**
 * 演示 选择排序
 * @author jerfan cang
 * @since 2021/4/22 20:47
 */
public class SelectSort {





    /**
     * 选择排序 <br>
     * 时间复杂度 O（n的平方）<br>
     * 0 ~ N-1 <br>
     * 1 ~ N -1 <br>
     * 2 ~ N -1 <br>
     * .... <br>
     * N-1 ~ N-1 <br>
     * @param arr 待排序的数组
     */
    public static void selectSort(int [] arr){
        if(null == arr || arr.length < 2){
            return;
        }


        for(int i =0 ; i < arr.length;i++){

            // 最小值在哪个位置上个 i ~ N-1
            int minIndex = i; // 最小值的索引下标
            for(int j=i+1;j<arr.length;j++){
                minIndex = arr[minIndex] > arr[j] ? j:minIndex;
            }
            if(minIndex != i) // 最小值位置发生变化，则执行位置上的值交换
                ArraySwap.baseSwap(arr,i,minIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = GenerateRandomArray.generateRandomArray(10,8);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
        selectSort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
    }

}
