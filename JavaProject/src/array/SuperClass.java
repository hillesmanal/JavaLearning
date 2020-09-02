package array;


class   Animal{
	Animal(){
		System.out.println("Animal is created");
		
	}}
	
class Dog extends Animal{
		Dog(){
			super();
			System.out.println("Dog is created");
		}
	
}
public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog dog= new Dog();
    
	}

}
