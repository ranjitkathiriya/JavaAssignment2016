import java.util.Scanner;
class sec
{
String data;
int key;
sec(String data,int key)
{
this.data=data;
this.key=key;
}
String enr()
{
char array[]=data.toCharArray();
for(int i=0;i<array.length;i++)
{
array[i]=(char)(array[i]+key);
}
return new String(array);
}
String dec()
{
char array[]=data.toCharArray();
for(int i=0;i<array.length;i++)
{
array[i]=(char)(array[i]-key);
}
return new String(array);
}
}

class Demo
{
public static void main(String s[])
{
Scanner ob=new Scanner(System.in);
String x=ob.next();
int y=ob.nextInt();
sec t=new sec(x,y);
String a=t.dec();
String b=t.enr();
System.out.print("encription:"+b);
System.out.print("\ndecription:"+a);
}
}
