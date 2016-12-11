
public class Testing 
{
	int x = 2;
	int y = 1;
	public void display()
	{
		System.out.println("Outer");
	}
	class Inner extends Testing
	{
		int x = 3;
		int y = 4;
		public void display()
		{
			System.out.println("Inner");
			System.out.println("Outer x: "+Testing.this.x);
			System.out.println("Outer y: "+Testing.this.y);
			System.out.println("Inner x: "+x);
			System.out.println("Inner y: "+y);
		}
	}
	
	public static void main(String args[])
	{
		Testing obj = new Testing();
		Testing.Inner innerObj = obj.new Inner();
		obj.display();
		innerObj.display();
	}
}
