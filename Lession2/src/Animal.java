
public class Animal 
{

	int age;
	String gender;
	int weightinLbs;
	
	public Animal(int age, String gender, int weightinLbs) 
	{
		
		this.age = age;
		this.gender = gender;
		this.weightinLbs = weightinLbs;
	}
	
	public void eat() 
	{
		
		System.out.println("Eating...");

	}
	
	public void sleep() 
	{
		System.out.println("Sleeping...");

	}
}
