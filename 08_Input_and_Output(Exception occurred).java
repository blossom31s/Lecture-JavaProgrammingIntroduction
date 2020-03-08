package inflearn;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
/*
		// FileInputStream, read() : 바이트 단위로 처리
		InputStream inputStream = null;
		try {

			inputStream = new FileInputStream("D:\\5_Workspace\\hello.txt");
			int data = 0;

			while(true) {

				try {
					data = inputStream.read();
				} catch (IOException e) {
					e.printStackTrace();
				}

				if(data == -1) break;
				System.out.println("data : " + data);
			}

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// FileInputStream, read(byte[]) : 바이트 단위로 처리
		InputStream inputStream = null;
		try {

			inputStream = new FileInputStream("D:\\5_Workspace\\hello.txt");
			int data = 0;
			byte[] bs = new byte[3];
	
			while(true) {
	
				try {
					data = inputStream.read(bs);
				} catch (Exception e) {
					e.printStackTrace();
				}
	
				if(data == -1) break;
				System.out.println("data : " + data);
				for(int i=0 ; i<bs.length ; ++i) {
					System.out.println("bs[" + i + "] : " + bs[i]);
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// FileOutputStream, write() : 바이트 단위로 처리
		OutputStream outputStream = null;
		try {

			outputStream = new FileOutputStream("D:\\5_Workspace\\hello.txt");
			String data = "Hello java world~!";
			byte[] arr = data.getBytes();

			try {
				outputStream.write(arr, 0, 5); // .write(arr) 로 입력할 경우 data 전체가 쓰여짐
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// FileInputStream&FileOutputStream, read()&write() : 바이트 단위로 처리
		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {
			inputStream = new FileInputStream("D:\\5_Workspace\\hello.txt");
			outputStream = new FileOutputStream("D:\\5_Workspace\\hello_copy.txt");
			int len = 0;
			byte[] dataArr = new byte[3];

			while(true) {
				len = inputStream.read(dataArr);
				if(len == -1) break;
				outputStream.write(dataArr, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(inputStream != null) {
				try { inputStream.close();	} catch (Exception e) { e.printStackTrace(); }
			}
			if(outputStream != null) {
				try { outputStream.close();	} catch (Exception e) { e.printStackTrace(); }
			}
		}

		// DataInputStream&DataOutputStream : 문자 단위로 처리
		InputStream inputStream = null;
		OutputStream outputStream = null;
		DataInputStream dataInputStream = null;
		DataOutputStream dataOutputStream = null;

		try {
			inputStream = new FileInputStream("D:\\5_Workspace\\hello.txt");
			dataInputStream = new DataInputStream(inputStream);

			String str = dataInputStream.readUTF(); // java.io.EOFException 발생, 이유는 모름

			outputStream = new FileOutputStream("D:\\5_Workspace\\hello_copy.txt");
			dataOutputStream = new DataOutputStream(outputStream);

			dataOutputStream.writeUTF(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(dataOutputStream != null) {
				try { dataOutputStream.close(); } catch (Exception e) { e.printStackTrace();	}
			}
			if(outputStream != null) {
				try { outputStream.close(); } catch (Exception e) { e.printStackTrace();	}
			}
		}

		// BufferedReader : 문자 단위로 처리
		String fileName = "D:\\5_Workspace\\hello.txt";

		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String strLine;

			while((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
*/
		// BufferedWriter : 문자 단위로 처리
		String fileName = "D:\\5_Workspace\\hello.txt";

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			String str = "Hello java world~\n";
			str += "Hello c world~\n";
			str += "Hello c++ world~\n";

			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
