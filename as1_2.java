import java.util.Scanner;
class car
{
int mno;
long cost;
String name,col;
void getcardea()
{
	Scanner ob=new Scanner(System.in);
	System.out.print("\nEnter name");
	name=ob.next();
	System.out.print("Enter model no");
	mno=ob.nextInt();
	System.out.print("Enter cost");
	cost=ob.nextLong();
	System.out.print("Enter colour");
	col=ob.next();
}
void putcardea()
{
	System.out.print("\nName"+name);
	System.out.print("\nModel no"+mno);
	System.out.print("\nCost"+cost);
	System.out.print("\ncolour"+col);
}
}
class demo
{
public static void main(String a[])
{
	car c[]=new car[3];
	for(int i=0;i<3;i++)
	{
	c[i]=new car();
	System.out.print("Enter information for car"+(i+1));
	c[i].getcardea();
	}
	for(int i=0;i<3;i++)
	{
	System.out.print("\ncar:"+(i+1));
	c[i].putcardea();
}
}
}
	