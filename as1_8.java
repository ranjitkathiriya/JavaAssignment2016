import java.util.Scanner;
class Array
{
int data[];
Array()
{
data=new int[10];
}
Array(int size)
{
data=new int[size];
}
Array(int data[])
{
this.data=new int[data.length];
this.data=data;
}
void Reverse_an_array()
{
int temp[]=new int[data.length];
for(int i=0;i<data.length;i++)
{
temp[i]=data[i];
}
int j=0;
int t=temp.length-1;
for(int i=t;i>=0;i--)
{
data[j]=temp[i];
j++;
}
System.out.print("\nReverse array:");
for(int k=0;k<data.length;k++)
{
System.out.print("\t"+data[k]);
}
}
int Maximum_of_array()
{
int max=data[0];
for(int i=1;i<data.length;i++)
{
if(max<data[i])
{
max=data[i];
}
}
return max;
}
int Avg_of_array()
{
int a=0;
for(int i=0;i<data.length;i++)
{
 a=a+data[i];
}
a=a/data.length;
return a;
}
void sort()
{
int i,j,t;
for(i=0;i<data.length;i++)
{
for(j=0;j<data.length-i-1;j++)
{
if(data[j]>data[j+1])
{
t=data[j];
data[j]=data[j+1];
data[j+1]=t;
}
}
}
System.out.print("\nSorted array:\n");
for(int k=0;k<data.length;k++)
{
System.out.print("\t"+data[k]);
}
}
void display()
{
System.out.print("\nFinal array:\n");
for(int j=0;j<data.length;j++)
{
System.out.print("\t"+this.data[j]);
}
}
int search(int no)
{
int i;
for(i=0;i<data.length;i++)
{
if(data[i]==no)
 break;
}
return i;
}
int size()
{
return data.length;
}
}
class demo
{
public static void main(String s[])
{
System.out.print("Enter array elements:");
Scanner ob=new Scanner(System.in);
int data[]=new int[5];
for(int i=0;i<data.length;i++)
{
data[i]=ob.nextInt();
}
int m;
Array a=new Array(data);
a.Reverse_an_array();
m=a.Maximum_of_array();
System.out.print("\nMaximum:"+m);
int n=a.Avg_of_array();
System.out.print("\nAverage:"+n);
a.sort();
a.display();
System.out.print("\nEnter no for search:");
int no=ob.nextInt();
int d=a.search(no);
System.out.print("Search_no is on index:"+(d+1));
m=a.size();
System.out.print("\nSize of array:"+m);
}
}