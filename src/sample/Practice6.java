package sample;

public class Practice6 {
	
	public class Person {
		
		private String name;
		private int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void display() {
			System.out.println("名前： " + name + ", 年齢： " + age);
		}
	}
	
	public static void main(String[] args) {
		Practice6 outer = new Practice6();
		Person person = outer.new Person("山田", 23);
		person.display();
	}
}
