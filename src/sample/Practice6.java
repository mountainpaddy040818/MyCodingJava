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
	
	class Student extends Person {
		private String studentId;
		
		public Student(String name, int age, String studentId) {
			super(name, age);
			this.studentId = studentId;
		}
		@Override
		public void display() {
			super.display();
			System.out.println("学生ID： " + studentId);
		}
		
		public static void main(String[] args) {
			Practice6 outer = new Practice6();
			Student student = outer.new Student("山田", 23, "S97531");
			student.display();
		}
	}
}
