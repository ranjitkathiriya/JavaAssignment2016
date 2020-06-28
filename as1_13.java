interface A
{
void display();
}


class B implements A
{
	 public  void display()
	{
		System.out.println("class B interface A");	
	}
}
class C extends B implements A
{
	public  void display()
	{
		System.out.println("class c interface A");
		}
	
}

class demo
{
public static void main(String a[])
{
B var;
 var = new B();

var.display();

C var1;
 var1 = new C();
var1.display();

 var = var1;
var.display();

}
}



/*class b interface a
	c  	a
        c       a
*/