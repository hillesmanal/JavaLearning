package strings;

public class UnderstandToString {
	
	int id;
	String name;

	public String toString()
	{
		return  id + " " + name;
	}
	
	public static void main(String[] args) {


		UnderstandToString obj1 = new UnderstandToString();
		obj1.id=100;
		obj1.name = "Manal";
		
		System.out.println(obj1);

	}

}
