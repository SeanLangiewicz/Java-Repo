
public class Earth 
{

	public static void main(String args[])
	{
		Human tom;
		tom = new Human();
		
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Zabro";
		tom.speak();
		
		Human joe = new Human();
		joe.age = 36;
		joe.eyeColor = " blue";
		joe.heightInInches = 95;
		joe.name = "Joe Bagel";
		joe.speak();
		
	}
}
