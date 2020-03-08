package inflearn;

public class MainClass {
	public static void main(String[] args) {

		// String
		String str = new String("Java");
		System.out.println("str : " + str);
		str += "_8";
		System.out.println("str : " + str);

		// StringBuffer
		StringBuffer sf = new StringBuffer("Java");
		System.out.println("sf : " + sf);
		sf.append(" world!");
		System.out.println("sf : " + sf);
		sf.insert(sf.length(), "~~~");
		System.out.println("sf : " + sf);
		sf.delete(4, 8);
		System.out.println("sf : " + sf);

		// StringBuilder
		StringBuilder sb = new StringBuilder("Java world~");
		System.out.println("sb : " + sb);
	}
}
