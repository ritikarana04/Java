class Wrapping
{
	public static void main(String args [])
	{
		byte num=120;
		int marks=95;
		float price=25.5f;
		double rate=123.4;

		Byte b=new Byte(num);
		Integer i=new Integer(marks);
		Float f=new Float(price);
		Double d=new Double(rate);

		System.out.println("Value of Wrapper object (printing as object)");
		System.out.println();
		System.out.println("Byte object b: " +b);
		System.out.println("Integer object i: " +i);
		System.out.println("Float object f: " +f);
		System.out.println("Double object d: " +d);

		System.out.println();

		Byte by=new Byte(num);
		Integer in=new Integer(marks);
		Float fl=new Float(price);
		Double dob=new Double(rate);

		System.out.println("Value of Un-wrapper object (printing as object)");
		System.out.println();
		System.out.println("Byte object by: " +by);
		System.out.println("Integer object in: " +in);
		System.out.println("Float object fl: " +fl);
		System.out.println("Double object dob: " +dob);
	}
}