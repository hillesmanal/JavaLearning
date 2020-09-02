package array;


class Animal{
	String color="white";
}
class Dog extends Animal{
	String color ="black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Dog dog= new Dog();
 dog.printColor();
	}

}
