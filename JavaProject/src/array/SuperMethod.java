package array;

class Animal{
	 void eat() {
 System.out.println("eating");
}}
	class Dog extends Animal{
	 void eat() {
		System.out.println("eating bread");	
		
		}
		void bark() {
			System.out.println("barking");
		}
		 void  work() {
			System.out.println("working ");
		
		super.eat();
		bark();
	}
	}


	class SuperMethod{  
		public static void main(String args[]){  
		Dog d=new Dog();  
		d.work();  
		}}  
	

