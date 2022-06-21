package cn.demo.static1;

public class StaticDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "zhou";
		s1.no = "123";
		s1.classroom = "room1";

		Student s2 = new Student();
		s2.name = "BIN";
		s2.no = "456";
		s2.classroom = "room2";
	}
}
class Student {
	String name;
	String no;
	String classroom;

}
