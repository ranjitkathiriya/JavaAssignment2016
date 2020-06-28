import java.util.Scanner;
class sales
{
String name;
int sales;
void info(String name,int sales)
{
this.name=name;
this.sales=sales;
}
void dis()
{
int com,temp;
temp=sales/1000;
if(sales>=25000)
{
com=temp*10;
}
else
{
com=temp*5;
}
System.out.print("Name:"+name+"\nsales:"+sales+"\nCommission:"+com);
}
}
class demo
{
public static void main(String a[])
{
Scanner ob=new Scanner(System.in);
sales s=new sales();
System.out.print("Enter name:");
String name=ob.next();
System.out.print("Enter sales:");
int sales=ob.nextInt();
s.info(name,sales);
s.dis();
}
} 