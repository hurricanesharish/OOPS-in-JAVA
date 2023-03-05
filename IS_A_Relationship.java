class Parent
{
	public void m1()
	{
		System.out.println("Parent Class");
	}
}

class Child extends Parent
{
	public void m2()
	{
		System.out.println("Child Class");
	}
}

class IS_A_Relationship
{
	public static void main(String[] args)
	{
		System.out.println(); // This statement for Output Understand only. 
		System.out.println("---------------------------------------------------------------------------------->");
		Parent p = new Parent();
		p.m1();
		//p.m2();
	
		Child c = new Child();
		c.m1();
		c.m2();

		Parent p1 = new Child();
		p1.m1();
		//p1.m2();
				 
		//Child c1 = new Parent();
		//c1.m1();
		//c1.m2();
		System.out.println("---------------------------------------------------------------------------------->");
		System.out.println(); // This statement for Output Understand only.
	}
}


/* NOTE:

Case1:
OUTPUT :-)
-------------
Parent Class
Parent Class
Child Class
Parent Class

Case2: If you want to get complete output of this java program then you must be commented these lines below
p.m2();
p1.m2();
Child c1 = new Parent();
c1.m1();
c1.m2();
*/













