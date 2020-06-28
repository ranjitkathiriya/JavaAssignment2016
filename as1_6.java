import java.util.Scanner;
class st
{
String name;
int basic_sal;
float da;
void putinfo()
{
Scanner ob=new Scanner(System.in);
System.out.print("Enter Name:");
name=ob.next();
System.out.print("Enter basic salary:");
basic_sal=ob.nextInt();
}
void display()
{
float tds;
da=(float)(basic_sal*0.74);
float temp;
temp=(float)basic_sal+da;
if(temp<=100000)
{
tds=0;
}
else
{
tds=(float)(temp*(0.10));
}
float net_sal=temp-tds;
System.out.print("Name"+name+"\nBasic salary"+basic_sal+"\nDearness allowance"+da+"\nTDS"+tds+"\nNet salary"+net_sal);
}
}
class demo
{
public static void main(String a[])
{
st s=new st();
s.putinfo();
s.display();
}
}   