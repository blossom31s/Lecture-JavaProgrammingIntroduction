/*
package inflearn;

public interface LambdaInterface1 {
	public void method(String s1, String s2, String s3);
}

package inflearn;

public interface LambdaInterface2 {
	public void method(String s1);
}

package inflearn;

public interface LambdaInterface3 {
	public void method();
}

package inflearn;

public interface LambdaInterface4 {
	public int method(int x, int y);
}
*/

package inflearn;

public class MainClass {
	public static void main(String[] args) {
/*
		// 매개변수와 실행문만으로 작성함(접근자, 반환형, return 키워드 생략)
		LambdaInterface1 li11 = (String s1, String s2, String s3) -> { System.out.println(s1 + " " + s2 + " " + s3); };
		li11.method("Hello", "java", "world!");

		// 매개변수 타입이 같을 때, 타입 생략 가능
		LambdaInterface1 li12 = (s1, s2, s3) -> { System.out.println(s1 + " " + s2 + " " + s3); };
		li12.method("Hello", "java", "world!");

		System.out.println();
		
		// 매개변수가 1개일 때, 타입 생략 가능
		LambdaInterface2 li21 = (s1) -> { System.out.println(s1); };
		li21.method("Hello");

		// 실행문이 1개일 때, '{}'를 생략 가능
		LambdaInterface2 li22 = (s1) -> System.out.println(s1);
		li22.method("Hello");

		// 매개변수와 실행문이 1개일 때, '()'와 '{}'를 생략 가능
		LambdaInterface2 li23 = s1 -> System.out.println(s1);
		li23.method("Hello");

		System.out.println();

		// 매개변수가 없을 때, '()'만 작성함
		LambdaInterface3 li3 = () -> System.out.println("no parameter");
		li3.method();

		System.out.println();

		// 반환값이 있는 경우
		LambdaInterface4 li4 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("li4.method(10, 20) : %d\n", li4.method(10, 20));

		li4 = (x, y) -> {
			int result = x - y;
			return result;
		};
		System.out.printf("li4.method(10, 20) : %d\n", li4.method(10, 20));

		li4 = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("li4.method(10, 20) : %d\n", li4.method(10, 20));
*/
	}
}
