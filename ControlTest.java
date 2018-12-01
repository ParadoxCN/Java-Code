import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class ControlTest{
    public static void main(String[] args){
        // int n;
        // {
        //     int n;  //Error,不能在嵌套块中声明同名变量
        // }
            // for(double x=0;x!=10;x+=0.1)    //检测两个浮点数是否相等必须非常小心，例如舍入误差导致这个for循环无法结束
            // {
            //     System.out.println(x);
            // }
            for(int i=0;i!=10;i+=1){
                System.out.println(i);
            }
            //可以在独立的for循环中定义同名变量
            for(int i=1;i!=9;i+=2){
                System.out.println(i);
            }
            Scanner in=new Scanner(System.in);
            System.out.print("Select an option(1,2,3)");
            int choice=in.nextInt();
            switch(choice)  //switch语句记住要加break
            {
                case 1:
                System.out.println(1);
                break;
                case 2:
                System.out.println(2);
                break;
                default:
                System.out.println("default");
                break;
            }
            Scanner input=new Scanner(System.in);
            int n;
            int m=0;
            read_data:
            while(m!=3){
                System.out.println("Enter a number>=0:");
                n=input.nextInt();
                if(n<10){
                    continue;
                }
                if(n<0){
                    System.out.println("Wrong!");
                    break read_data;
                }
                System.out.println("Nice!");
                m++;
            }
            for(int i=0;i<10;i++){
                if(i%2==0){
                continue;
                }
                System.out.println(i);
            }
            BigInteger a=BigInteger.valueOf(1213);
            BigInteger b=BigInteger.valueOf(12123213);
            BigDecimal c=BigDecimal.valueOf(121321.7565757);
            BigDecimal d=BigDecimal.valueOf(142342.832473276);
            BigInteger e=a.multiply(b.add(BigInteger.valueOf(2)));  //e=a*(b+2)
            BigDecimal f=c.add(d);
            System.out.println(e);
            System.out.println(f);
    }
}