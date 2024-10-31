
class Student {
	int number;
	String name;

	void speak() {
		System.out.println("学号：" + number + "\n姓名：" + name);
	}
}

public class Example4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.speak();
		stu1.name = "雪樱大叔";
		stu1.number = 2023115208;
		stu1.speak();

		Student stu[];
		stu = new Student[10];	 
		
		for (int i = 0; i < stu.length; i++)
			stu[i] = new Student();

	}

}
