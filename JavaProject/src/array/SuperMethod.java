package array;

class Animal1{
	 void eat() {
 System.out.println("eating");
}}
	class Dog1 extends Animal1{
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
		Dog1 d=new Dog1();  
		d.work();  
		}}  
	
	count the character A 
	reverse string 
	
	

