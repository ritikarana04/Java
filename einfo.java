class einfo
{
int yearjoin;
float salary;
String name;
String address;
void display()
{
System.out.println(name + "\t" + yearjoin + "\t\t" + address + "\t" + salary);
}
}

class employee
{
	public static void main(String args[])
	{
		
		System.out.print("Employee Information is as follows: ");
		System.out.println("\n Name\t Year of Joining\t Address\t Salary\n");


		einfo a = new einfo();
		a.name = "Robert";
		a.yearjoin = 1994;
		a.address = "64C- WallsStreat";
		a.salary = 50000;
		a.display();
		
		einfo b = new einfo();
		b.name = "Sam";
		b.yearjoin = 2000;
		b.address = "68D- WallsStreat";
		b.salary = 30000;
		b.display();
		
		einfo c = new einfo();
		c.name = "John";
		c.yearjoin = 1999;
		c.address = "26B- WallsStreat";
		c.salary = 65000;
		c.display();


	}
}