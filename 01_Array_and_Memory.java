package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);

		for(int i=0 ; i<5 ; ++i) {
			System.out.printf("%s의 점수를 입력하세요. : ", name[i]);
			score[i] = scanner.nextInt();
		}

		for(int i=0 ; i<5 ; ++i) {
			System.out.printf("%s의 점수 : %.2f\n", name[i], (double)score[i]);
		}

		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("평점 : %.2f\n", ave);

		System.out.println("--------------------------------------------------");

		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;

		// 배열 길이
		System.out.println("arrAtt1.length : " + arrAtt1.length);

		// 배열 요소
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));

		// 배열 복사
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length); // arrAtt3과 arrAtt1은 요소 값은 같아도 다른 주소 값을 가리킴
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));

		// 배열 레퍼런스
		arrAtt2 = arrAtt1; // arrAtt2가 arrAtt1과 같은 주소 값을 가리킴
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);

		System.out.println("--------------------------------------------------");

		// 다차원 배열
		int[][] arrMul = new int[3][2];
		for(int i=0 ; i<3 ; ++i) {
			for(int j=0 ; j<2 ; ++j) {
				arrMul[i][j] = (i+1) * (j+1) * 10;
			}
		}
		for(int i=0 ; i<3 ; ++i) {
			System.out.println("arrMul[" + i + "] : " + Arrays.toString(arrMul[i]));
		}
	}
}
