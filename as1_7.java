import java.util.Scanner;
class stack
{
double arry[];
int size,top=0;
stack(int size)
{
this.size=size;
double arry[]=new double[this.size];
}
void push(double no)
{
if(top==size-1)
{
System.out.print("OVERFLOW");
}
else
{
System.out.print("else"+top);
arry[top]=no;
top++;
}
}
double pop()
{
if(top==0)
{
System.out.print("UNDERFLOW");
}
else
{
top=top-1;
return arry[top];
}
}
}
class demo
{
public static void main(String s[])
{
Scanner ob=new Scanner(System.in);
stack a=new stack(10);
System.out.print("Enter no to push:");
double no=ob.nextDouble();
a.push(no);
double x;
x=a.pop();
System.out.print("pop Element:"+x);
}
}
