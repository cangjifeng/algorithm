package org.jerfan.algorithm.lesson1;

/**
 * 演示 冒泡排序
 * @author jerfan cang
 * @since 2021/4/22 20:47
 */
public class DoubleSort {





    /**
     * 冒泡排序 <br>
     * 时间复杂度 O（n的平方）<br>
     * 0 ~ N-1 <br>
     * 0 ~ N-2 <br>
     * 0 ~ N-3 <br>
     * .... <br>
     * 0 ~ 0 <br>
     * @param arr 待排序的数组
     */
    public static void doubleSort(int [] arr){
        if(null == arr || arr.length < 2){
            return;
        }

        /*
          0 1 位置上的值比较 大的放后面
          1 2 位置上的值比较 大的放后面
          2 3 位置上的值比较 大的放后面
          . . .
          i-1  i 位置上的值比较 大的放后面

         */
        for(int i =0 ; i < arr.length;i++){

            for(int j=0;j<i;j++){
                if(arr[i] < arr[j])
                    ArraySwap.swap(arr,i,j);

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 8, 9, 19};

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
        doubleSort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
    }

}
