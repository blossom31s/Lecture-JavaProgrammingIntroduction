/*
// Client
package inflearn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
	public static void main(String[] args) {

		Socket socket = null;

		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;

		InputStream inputStream = null;
		DataInputStream dataInputStream = null;

		Scanner scanner = null;

		try {
			socket = new Socket("localhost", 9000);
			System.out.println("서버 연결 완료~");

			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);

			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);

			scanner = new Scanner(System.in);

			while(true) {
				System.out.println("메시지 입력~");

				String outMessage = scanner.nextLine();
				dataOutputStream.writeUTF(outMessage);
				dataOutputStream.flush();

				String inMessage = dataInputStream.readUTF();
				System.out.println("inMesage : " + inMessage);

				if(outMessage.equals("stop")) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

// Server
package inflearn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;

		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료~");

			socket = serverSocket.accept();
			System.out.println("클라이언트 연결~");
			System.out.println("socket : " + socket);

			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);

			while(true) {
				String clientMessage = dataInputStream.readUTF();
				System.out.println("clientMessage : " + clientMessage);

				dataOutputStream.writeUTF("메시지 전송 완료~");
				dataOutputStream.flush();

				if(clientMessage.equals("stop")) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				if(socket != null) socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

*/
