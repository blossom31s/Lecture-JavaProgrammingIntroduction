package inflearn;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {

		// ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("list.size() : " + list.size());

		// 추가
		list.add("Hello");
		list.add("java");
		list.add("world!");
		System.out.println("list.size() : " + list.size());
		System.out.println("list : " + list);
		list.add(2, "Programming");
		System.out.println("list : " + list);

		// 변경
		list.set(1, "c");
		System.out.println("list.set(1, \"c\")");
		System.out.println("list : " + list);

		// 추출
		String str = list.get(2);
		System.out.println("list.get(2) : " + str);
		System.out.println("list : " + list);

		// 제거
		str = list.remove(2);
		System.out.println("list.remove(2) : " + str);
		System.out.println("list : " + list);

		// 전체 제거
		list.clear();
		System.out.println("list.clear()");
		System.out.println("list : " + list);

		// 데이터 유무 확인
		boolean b = list.isEmpty();
		System.out.println("list.isEmpty() : " + b);

		System.out.println("--------------------------------------------------");

		// HashMap 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map.size() : " + map.size());

		// 추가
		map.put(5, "Hello");
		map.put(6, "java");
		map.put(7, "world~");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		map.put(8, "!");
		System.out.println("map : "+  map);

		// 변경
		map.put(6, "c");
		System.out.println("map.put(6, \"c\")");
		System.out.println("map : " + map);

		// 추출
		str = map.get(5);
		System.out.println("map.get(5) : " + str);
		System.out.println("map : " + map);

		// 제거
		map.remove(8);
		System.out.println("map.remove(8)");
		System.out.println("map : " + map);

		// 데이터 포함 유무 확인
		b = map.containsKey(7);
		System.out.println("map.containsKey(7) : " + b);

		// 전체 제거
		map.clear();
		System.out.println("map.clear()");
		System.out.println("map : " + map);

		// 데이터 유무 확인
		b = map.isEmpty();
		System.out.println("map.isEmpty() : " + b);
	}
}
