import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;
import javafx.scene.transform.Scale;

public class PrintTest{
    public static void main(String[] args){
        String adj="fantastic";
        Boolean bool=false;
        int number=521321;
        char a='a';
        double number1=8821331.771246;
        String message=String.format("Hello,number is %d %<x %1$o.",number);
        System.out.println(message);
        System.out.printf("Hello,this is %s world!\n",adj);
        System.out.printf("%d %<x %1$d %<x %1$#x %1$#o\n",number);
        System.out.printf("%b\n",bool);
        System.out.printf("%,.2f % e %g %a\n",number1,number1,number1,number1);
        System.out.printf("%,.2f % e %4$g %3$d\n",number1,number1,number,number1);
        System.out.printf("%c\n",a);
        // Scanner in=new Scanner(Paths.get("C:\\Users\\Tiene\\Documents\\Java Code\\test.txt"),"UTF-8");
        // PrintWriter out=new PrintWriter(Paths.get("C:\\Users\\Tiene\\Documents\\Java Code\\test.txt"));
        String dir=System.getProperty("user.dir");
        System.out.println(dir);
    }
}