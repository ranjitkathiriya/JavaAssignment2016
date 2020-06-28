import java.util.Scanner;
class bankAcc
{
Scanner ob1=new Scanner(System.in);
	String name,acc_t;
	int acc_no=0;
	int bal;
void createAcc(bankAcc b)
{
System.out.print("Enter name");
name=ob1.next();
System.out.print("Enter acc_type:");
acc_t=ob1.next();
acc_no=b.acc_no+1;
System.out.print("Your acc_no:"+acc_no);
System.out.print("\nYour Current balance:"+0000);	
}
void deposit(int no)
{

//System.out.print("in de"+acc_no+no);
if(acc_no==no)
{
System.out.print("Enter amount:");
int d=ob1.nextInt();
bal=bal+d;
System.out.print("new_balance:"+bal);
}
}
void withdraw(int no)
{
if(acc_no==no)
{

System.out.print("Enter amount:");
int d=ob1.nextInt();
if(bal<d)
System.out.print("Can't withdraw");
else
bal=bal-d;
System.out.print("\nbalance:"+bal);
}
}
void bal(int no)
{
if(acc_no==no)
{
System.out.print("Your balance:"+bal);
}
}
}
class demo
{
public static void main(String a[])
{
Scanner ob=new Scanner(System.in);
int l=1,j=0;
int no;
bankAcc b[]=new bankAcc[10];
int i;
while(l==1)
{
System.out.print("1:create\n2:deposit\n3:withdraw\n4:Balancelnquiry");
int c=ob.nextInt();
switch(c)
{
case 1:
 b[j]=new bankAcc();
if(j==0)
b[j].createAcc(b[j]);
else
b[j].createAcc(b[j-1]);
j++;
break;
case 2:
System.out.print("Enter accno:");
no=ob.nextInt();
for(i=0;i<j;i++)
{
b[i].deposit(no);
}
break;
case 3:
System.out.print("Enter accno:");
 no=ob.nextInt();
for(i=0;i<j;i++)
{
b[i].withdraw(no);
}
break;
case 4:
System.out.print("Enter accno:");
 no=ob.nextInt();
for(i=0;i<j;i++)
{
b[i].bal(no);
}
break;
}
System.out.print("\nDO you Want to continue?\n1:Yes\n2:no");
l=ob.nextInt();
}
}
}