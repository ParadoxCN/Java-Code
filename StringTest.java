import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {    
    String greeting="Hello";
    String lowercasegreeting="hello";
    int n=greeting.length();
    String substring=greeting.substring(0, 3);
    String stringadd=greeting+substring;
    String stringtest="HelloHel";
    String all=String.join("/","S","M","L");
    String stringempty="";
    String stringnull=null;
    char a=greeting.charAt(1);
    int cpcount=greeting.codePointCount(0, greeting.length());
    int index=greeting.offsetByCodePoints(0, 2);
    int cp=greeting.codePointAt(index);
    int[] codePoints=greeting.codePoints().toArray();
    String str=new String(codePoints,0,codePoints.length);
    String blankspacestring="  stringwithblankspace   ";
    StringBuilder builder=new StringBuilder();
    Scanner in =new Scanner(System.in);
        System.out.println(n);
        System.out.println(substring);
        System.out.println(stringadd);
        System.out.println(stringtest==stringadd);
        System.out.println(stringtest.equals(stringadd));
        System.out.println(stringtest.compareTo(stringadd));
        System.out.println(all);
        if(stringempty.length()==0){
            System.out.println("stringempty is empty string through obj.length()==0.");
        }
        if(stringempty.equals("")){
            System.out.println("stringempty is empty string through obj.equals(\"\").");
        }
        if(stringnull==null){
            System.out.println("stringnull is null through obj==null.");
        }
        if(greeting!=null&&greeting.length()!=0){
            System.out.println("String greeting isn't null or empty string.First check null.");
        }
        System.out.println("String greeting codepoint count is "+cpcount+", while String greeting length is "+greeting.length()+".");
        System.out.println("String greeting charAt(1) is "+a+".");
        System.out.println("String greeting offsetByCodePoints is index: "+index+"."+" offsetByCodePoints返回从startIndex代码点开始，位移cpCount后的码点索引.");
        System.out.println("String greeting codePointAt(index) is "+cp+".It's a unicode编码.");
        System.out.println("将码点数组转换成字符串："+str+". String.codePoints()将字符串的码点作为一个流返回，调用toArray将它们放到一个数组中.");
        System.out.println(greeting.equalsIgnoreCase(lowercasegreeting)+". str.equalsIgnoreCase()方法.");
        System.out.println(greeting.startsWith("Hel")+". str.startsWith(prefix)方法."+greeting.endsWith("lo")+". str.endsWith(suffix)方法.");
        System.out.println(greeting.indexOf("o")+". str.indexOf()方法.查找子串出现的位置，也可用于查找代码点，默认从尾端开始查找，但索引是从首部开始计算.");
        System.out.println(greeting.indexOf("l",3)+". str.indexOf从第二个参数指引的开始位置查找.");
        System.out.println(stringtest.replace("Hel", "joe")+". str.replace(oldstring,newstring)将str中所有oldstring替换为newstring形成新字符串返回,而原来的str不变.");
        System.out.println(stringtest.toUpperCase()+". str.UpperCase()将字符串全部改为大写,str.LowerCase()同理.");
        System.out.println(blankspacestring+"."+blankspacestring.trim()+". str.trim()删除原始字符串头部和尾部的空格并返回新字符串.");
        System.out.println(builder.append(greeting).append("11312312").toString()+". builder.append()可以向builder字符串构建器中添加字符串并返回this.builder.appendCodePoint()可以追加一个代码点，转换为一个或两个代码单元并返回this.");
        System.out.println(builder.length()+". builder.length().");
        System.out.println("What's your name?");
        String name=in.nextLine();
        String firstName=in.next();
        int age=0;
        if(in.hasNextInt()==true){
        age=in.nextInt();
        }
        double num=0;
        if(in.hasNextDouble()==true){
        num=in.nextDouble();
        }
        System.out.println(name);
        System.out.println(firstName);
        System.out.println(age);
        System.out.println(num);
        // Console cons=System.console();
        // String username=cons.readLine("User name: ");
        // char[] passwd=cons.readPassword("Password: ");
        // System.out.println(username+" "+passwd.toString());
        
    }
}