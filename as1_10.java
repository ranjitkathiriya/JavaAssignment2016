import java.util.Scanner;
class student
{
Scanner ob=new Scanner(System.in);
String name;
long en_no;
float m1,m2,m3,m4,per;
student(){}
student(String name,long en_no,int m1,int m2,int m3,int m4)
{
this.name=name;
this.en_no=en_no;
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.m4=m4;
//this.per=per;
}
void read_dea()
{
System.out.print("Enter name:");
name=ob.next();
System.out.print("\nEnter enrollment no:");
en_no=ob.nextLong();
System.out.print("Enter marks for 4 subjects:");
m1=ob.nextFloat();
m2=ob.nextFloat();
m3=ob.nextFloat();
m4=ob.nextFloat();
}
void display_dea(String n,String s2)
{
if(name.compareTo(n)==0)
{
if(n.contains(s2))
{
System.out.print("IN IF2");
display_dea();
}
}
}
void display_dea()
{
//int b=1;
System.out.print("\nName:"+name+"\nEnrollment_no:"+en_no+"\nmarks:"+m1+"\t"+m2+"\t"+m3+"\t"+m4);
float m=cal_per();
System.out.print("\nPercentage:"+m);
}
float cal_per()
{
per=(m1+m2+m3+m4)*100/400;
return per;
}
}
class demo
{
public static void main(String a[])
{
int b=1;
Scanner ob1=new Scanner(System.in);
student s[]=new student[5];
for(int i=0;i<5;i++)
{
s[i]=new student();
s[i].read_dea();
}
while(b==1)
{
String n,s2="patel";
System.out.print("Enter name to dispaly deatils:");
n=ob1.next();
for(int j=0;j<5;j++)
{
s[j].display_dea(n,s2);
}

System.out.print("Do you want to continue?\n1:Yes\n2:No");
b=ob1.nextInt();
}
}
} 