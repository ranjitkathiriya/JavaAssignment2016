import java.util.Scanner;
class time
{
int h,m,s;
time()
{
}
time(int h,int m,int s)
{
this.h=h;
this.m=m;
this.s=s;
}
time sum(time a,time a1)
{
int m1=0,h1=0;
time temp=new time();
temp.s=a.s+a1.s;
if(temp.s>60)
{
m1=(temp.s)/60;
temp.s=temp.s-(m1*60);
}
temp.m=a.m+a1.m+m1;
if(temp.m>60)
{
h1=(temp.m)/60;
temp.m=temp.m-(h1*60);
}
temp.h=a.h+a1.h+h1;
return temp;
}
}
class demo
{
public static void main(String a[])
{
System.out.print("Insert Hour:\tMinute:\tSecond:");
Scanner ob=new Scanner(System.in);
int h=ob.nextInt();
int m=ob.nextInt();
int s=ob.nextInt();
time t=new time(h,m,s);
System.out.print("Insert Hour:\tMinute:\tSecond:");
 h=ob.nextInt();
 m=ob.nextInt();
 s=ob.nextInt();
time t1=new time(h,m,s);
time t2=new time();
t2=t2.sum(t,t1);
System.out.print("Hour:"+t2.h+"\nMinutes:"+t2.m+"\nSecond:"+t2.s);
}
}