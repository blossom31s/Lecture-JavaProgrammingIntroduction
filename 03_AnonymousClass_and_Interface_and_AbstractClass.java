/*
package inflearn;

public class AnonymousClass {
	public AnonymousClass() {
		System.out.println("AnonymousClass Constructor");
	}

	public void method() {
		System.out.println("-- AnonymousClass's Method Start --");
	}
}

package inflearn;

public interface InterfaceA {
	public void functionA();
}

package inflearn;

public interface InterfaceB {
	public void functionB();
}

package inflearn;

public class ImplementClass implements InterfaceA, InterfaceB {
	public ImplementClass() {
		System.out.println("ImplementClass Contructor");
	}

	@Override
	public void functionA() {
		System.out.println("-- functionA() Start --");
	}

	@Override
	public void functionB() {
		System.out.println("-- functionB() Start --");
	}
}

package inflearn;

public interface InterfaceC {
	public void functionC();
}

package inflearn;

public class ImplementC1 implements InterfaceC {
	public ImplementC1() {
		System.out.println("ImplementC1() Constructor");
	}

	@Override
	public void functionC() {
		System.out.println("-- ImplementC1 functionC() Start --");
	}
}

package inflearn;

public class ImplementC2 implements InterfaceC {
	public ImplementC2() {
		System.out.println("ImplementC2() Constructor");
	}

	@Override
	public void functionC() {
		System.out.println("-- ImplementC2 functionC() Start --");
	}
}

package inflearn;

public abstract class Bank {
	String name;
	String account;
	int totalAmount;

	public Bank() {
		System.out.println("Bank Constructor");
	}

	public Bank(String name, String account, int totalAmount) {
		System.out.println("Bank Constructor");

		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}

	// 예금
	public void deposit() {
		System.out.println("-- deposit() Start --");
	}

	// 출금
	public void withdraw() {
		System.out.println("-- withdraw() Start --");
	}

	// 적금
	public abstract void installmentSavings();

	// 해약
	public abstract void cancellation();

	// 정보출력
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %s\n", totalAmount);
	}
}

package inflearn;

public class MyBank extends Bank {
	public MyBank(String name, String account, int totalAmount) {
		super(name, account, totalAmount);
	}

	@Override
	public void installmentSavings() {
		System.out.println("-- installmentSavings() Start --");
	}

	@Override
	public void cancellation() {
		System.out.println("-- cancellation() Start --");
	}
}
*/

package inflearn;

public class MainClass {
	public static void main(String[] args) {
/*
		// 익명 클래스
		// AnonymousClass className = new AnonymousClass(); 에서
		// 한 번 쓰고 버릴 용도로 className 없이 사용함
		new AnonymousClass() {

			@Override
			public void method() {
				System.out.println("-- AnonymousClass's Override Method Start --");
			};
		}.method(); // 클래스가 끝나서 메서드가 사라지기 전에 .method() 메서드를 사용함

		// 인터페이스 : 여러 개의 interface를 하나의 클래스에 implements 하는 경우
		InterfaceA ia = new ImplementClass(); // implements 해준 interface 중에서 하나의 타입을 가질 수 있음 
		InterfaceB ib = new ImplementClass(); // implements 해준 interface 중에서 하나의 타입을 가질 수 있음
		ia.functionA();
		ib.functionB();
		System.out.println();

		// 인터페이스 : 하나의 interface를 여러 개의 클래스에 implements 하는 경우
		InterfaceC ic1 = new ImplementC1();
		InterfaceC ic2 = new ImplementC2();
		InterfaceC arrC[] = {ic1, ic2};
		for(int i=0 ; i<arrC.length ; ++i) {
			arrC[i].functionC();
		}
		System.out.println();

		// 추상 클래스
		Bank myBank = new MyBank("박찬호", "123-4567-89012", 10000);
		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();
		System.out.println();
		myBank.getInfo();
*/
	}
}
