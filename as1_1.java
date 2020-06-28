import java.util.Scanner;
class student
{
	int r;
int m[]=new int[5];
	//new int[5];
	String name;
	void getinfo()
	{
	System.out.print("\nInformation:");
	System.out.print("\nName:"+name);
	System.out.print("\nrollno:"+r);
	System.out.print("\nMarks:");
	for(int i=0;i<m.length;i++)
	{
System.out.print("\n");
	System.out.print(m[i]);
	}
	
	}
	void putinfo()
	{
	//		System.out.print("information:");
	Scanner ob1=new Scanner(System.in);
	System.out.print("Enter Name:");
	 this.name=ob1.next();
	System.out.print("Enter rollno:");
	
	 this.r=ob1.nextInt();
	System.out.print("Enter Marks:");
	for(int i=0;i<m.length;i++)
	{
	this.m[i]=ob1.nextInt();
	}	
	}
	float calCPI()
	{
	int p;
	float sum=0;
	for(int i=0;i<m.length;i++)
	{
	if(m[i]<35)
	{
	System.out.print("Mark is below 35:");
//	goto p;
	System.exit(0);
	}
	else
	{
	sum=(sum+m[i])/5;
	}
}
//return sum;
//	p:Sytem.out.print("can't calculate cpi");
return sum;
}
}
class Demo
{
public static void main(String a[])
{	Scanner ob=new Scanner(System.in);

	student s;
	s=new student();
	s.putinfo();
	s.getinfo();
	float y;
	y=s.calCPI();
	System.out.print("cpi:"+y);
}
}