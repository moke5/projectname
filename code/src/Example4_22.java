
class Student {
	int number;
	String name;

	void speak() {
		System.out.println("ѧ�ţ�" + number + "\n������" + name);
	}
}

public class Example4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.speak();
		stu1.name = "ѩӣ����";
		stu1.number = 2023115208;
		stu1.speak();

		Student stu[];
		stu = new Student[10];

//		stu[3] = new Student();
//		stu[3].name = "ѩӣ��������";
//		stu[3].number = 2023115208;
//		stu[3].speak();
//		 

		for (int i = 0; i < stu.length; i++)
			stu[i] = new Student();

	}

}
