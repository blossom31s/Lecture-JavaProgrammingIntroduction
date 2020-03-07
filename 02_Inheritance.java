package inflearn;

/*
public class ParentClass {
	int openYear = 1995;

	public ParentClass() {
		System.out.println("ParentClass Constructor");
	}

	public void makeJJajang() {
		System.out.println("-- makeJJajang() Start --");
	}
}

public class ChildClass extends ParentClass {
	int openYear = 2000;

	public ChildClass() {
		System.out.println("ChildClass Constructor");
	}

	@Override
	public void makeJJajang() {
		System.out.println("-- more delicious makeJJajang() Start --");
	}

	public void getOpenYear() {
		System.out.println("ChildClass's Open Year : " + this.openYear);
		System.out.println("ParentClass's Open Year : " + super.openYear); // super는 상위 클래스를 가리킴
	}
}

public class FirstChildClass extends ParentClass {
	public FirstChildClass() {
		System.out.println("FirstChildClass Constructor");
	}

	@Override
	public void makeJJajang() {
		System.out.println("-- FirstChildClass's makeJJajang() Start --");
	}
}

public class SecondChildClass extends ParentClass {
	public SecondChildClass() {
		System.out.println("SecondChildClass Constructor");
	}

	@Override
	public void makeJJajang() {
		System.out.println("-- SecondChildClass's makeJJajang() Start --");
	}
} 
*/

public class MainClass {
	public static void main(String[] args) {

		// 메서드 오버라이드
		ChildClass child = new ChildClass();
		child.makeJJajang();
		System.out.println();

		// 클래스도 하나의 자료형(타입)임
		ParentClass childs[] = new ParentClass[2];
		childs[0] = new FirstChildClass(); // 하위 클래스 안에 상위 클래스가 이미 있기에 대입이 가능함
		childs[1] = new SecondChildClass(); // 하위 클래스 안에 상위 클래스가 이미 있기에 대입이 가능함

		for(int i=0 ; i<childs.length ; ++i) {
			childs[i].makeJJajang();
		}
		System.out.println();

		// Object 클래스(최상위 클래스)
		Object objs[] = new Object[2];
		objs[0] = new FirstChildClass();
		objs[1] = new SecondChildClass();

		for(int i=0 ; i<objs.length ; ++i) {
			// objs[i].makeJJajang(); // 하위 클래스의 메서드를 이용하기 위해서는 상위 클래스의 객체에서 이용할 수 없음

			// 상위 클래스를 하위 클래스로 형변환 한 후 하위 클래스의 메서드를 이용함
			if(i == 0) {
				((FirstChildClass)objs[i]).makeJJajang();
			} else {
				((SecondChildClass)objs[i]).makeJJajang();
			}
			System.out.println();
		}

		// super
		ChildClass c = new ChildClass();
		c.getOpenYear();
	}
}
