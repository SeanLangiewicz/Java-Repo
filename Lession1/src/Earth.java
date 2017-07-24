
public class Earth 
{

	public static void main(String args[]) 
	{
		Human tom;
		Human Joe;
		
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Zabo";
		tom.speak();
		
		Joe = new Human();
		Joe.age = 2;
		Joe.eyeColor = "blue";
		Joe.heightInInches = 65;
		Joe.name = "Joe Bart";
		Joe.speak();
		
	}
}
