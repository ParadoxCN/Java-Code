import java.util.*;
public class ArrayTest{
    public static void main(String args[]){
        int[] number={1,0,3,2};
        int[] number1=number;
        int[] copiedNumber=Arrays.copyOf(number,2*number.length);
        for(int element:number){
            System.out.println(element);
        }
        for(int element:number1){
            System.out.println(element);
        }
        for(int element:copiedNumber){
            System.out.println(element);
        }
        Arrays.sort(number);
        for(int element:number){
            System.out.println(element);
        }
        int location=Arrays.binarySearch(number,0,4,4);//二分查找数字4，如果不存在，则返回r，-r-1为保持number数组有序而应该插入4的地方
        System.out.println(location);
        Arrays.fill(number, 3);
        for(int element:number){
            System.out.println(element);
        }
        System.out.println(Arrays.equals(number, number1));
        double[][] twoDimensionArray=new double[3][3];
        for(double[] row:twoDimensionArray){
            for(double value:row){
                System.out.println(value);
            }
        }
        double[][] twoDimensionArray1={{1,2,3,4},{3,4,5,6},{6,3,1,3}};
        System.out.println(Arrays.deepToString(twoDimensionArray1));
        for(double[]row:twoDimensionArray1){
            for(double value:row){
                System.out.println(value);
            }
        }   //遍历二维数组
        int [][]odds=new int[3][];
        for(int n=0;n<3;n++){
            odds[n]=new int[n+1];
        }   //不规则数组
        System.out.println(Arrays.deepToString(odds));
    }
}