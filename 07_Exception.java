package inflearn;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		int i, j;
		ArrayList<String> list = null;
		Scanner scanner = new Scanner(System.in);

		int[] iArr = {0, 1, 2, 3, 4};

		System.out.println("Exception Before");

		try {

			// 정수를 입력하지 않고 문자를 입력할 경우, InputMismatchException 발생
			System.out.println("input i : ");
			i = scanner.nextInt();
			System.out.println("input j : ");
			j = scanner.nextInt();
			System.out.println("i / j = " + (i / j));

			// ArrayIndexOutOfBoundsException 발생
			for(int k=0 ; k<6 ; ++k) {
				System.out.println("iArr[" + k + "] : " + iArr[k]);
			}

			// NullPointerException 발생
			System.out.println("list.size() : " + list.size());

		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally 부분은 Exception 발생 여부와 관계없이 언제나 실행됨");
		}

		System.out.println("Exception After");

	}
}
