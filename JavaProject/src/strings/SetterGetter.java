package strings;

public class SetterGetter {
	
	//id >500
	//name should be atleast 5 char

	  private int id;
	  private String name;
	  
	  
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if(id<500)
		{
			System.out.println("Invalid Id....");
		}else {
			
		
		this.id = id;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		if(name.length()<5)
		{
			System.out.println("Invalid name");
		}else
		{
		this.name = name;
		}
	}
	  
	  
	  
	 
	 
	 
	 
	 
	
	
}
