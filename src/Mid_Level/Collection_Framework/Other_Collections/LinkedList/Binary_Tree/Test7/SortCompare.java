package Mid_Level.Collection_Framework.Other_Collections.LinkedList.Binary_Tree.Test7;

import java.util.Arrays;

public class SortCompare {

    public static void main(String[] args) {
        //初始化随机数
        int total = 40000;
        System.out.println("初始化一个长度是"+total+"的随机数字的数组");
        int[] originalNumbers = new int[total];
        for (int i = 0; i < originalNumbers.length; i++) {
            originalNumbers[i] = (int)(Math.random()*total);
        }
        System.out.println("初始化完毕");
        System.out.println("接下来分别用3种算法进行排序");

        //从初始化了的随机数组复制过来，以保证，每一种排序算法的目标数组，都是一样的
        int[] use4sort;

        use4sort = Arrays.copyOf(originalNumbers,originalNumbers.length);
//        int[] sortedNumbersBySelection = performance
    }
}
