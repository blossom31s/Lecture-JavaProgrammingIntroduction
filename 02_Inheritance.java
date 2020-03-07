package inflearn;

/*
public class ParentClass {
	public String str = "ParentClass";
	private int num = 10;

	public ParentClass() {
		System.out.println("ParentClass Constructor");
	}

	public void parentFun() {
		System.out.println("-- parentFun() Start --");
	}

	private void parentPrivateFun() {
		System.out.println("-- parentPrivateFun() Start --");
	}
}
*/

/*
public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("ChildClass Constructor");
	}

	public void childFun() {
		System.out.println("-- childFun() Start --");
	}
}
*/

public class MainClass {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();

		child.parentFun();
		child.childFun();

		System.out.println("child.str : " + child.str);

/*
		// private 객체는 상속되지 않음
		System.out.println("child.num : " + child.num);
		child.parentPrivateFun();
*/
	}
}
