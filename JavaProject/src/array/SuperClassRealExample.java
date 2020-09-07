package array;


public class SuperClassRealExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person{
	Person(){
		
	}
	int id;
	String name;
	Person(int id,String name){
		 this .id= id ;
		 this.name = name ;
		 
	}}
	class Emp extends Person{
		float salary;	
	Emp(int id,String name,float salary){
		this.salary= salary;
		
	}
}

