package Main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class loading implements Runnable {

	@SuppressWarnings("resource")
	@Override
	public void run() {
		
		int dva = 0;
		while(dva<2){
			
			dva++;
			
		System.out.println("�������� ���������� ����� � ������� �� ����� ������: ������� .json ��� .xml");
		Scanner sc = new Scanner(System.in);
		String fileFormat = sc.nextLine();//���������� ���� � ���������� ��� ������������
		
		
		InputStream inputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try{
			System.out.println("���� ��������� ������");
			URL url = new URL("http://kiparo.ru/t/currency"+fileFormat); //������ ��������� ����, ��� ����� � ���������
			HttpURLConnection connection =
					(HttpURLConnection) url.openConnection();
			
		int status = connection.getResponseCode();
		 
		if(status== HttpURLConnection.HTTP_OK); {
			inputStream = connection.getInputStream();
			
			File file = new File("KusVal"+fileFormat);// ������� ���� ������� ������� 
			
			fileOutputStream = new FileOutputStream(file);
			
			int byteRead = -1;
			byte[] bufer = new byte [4096]; // ������������� ������ ������ ������ ��� �������
			while(( byteRead = inputStream.read(bufer)) !=-1){
				fileOutputStream.write(bufer, 0, byteRead);// �������� ���������� ���� ���������� ����������
				System.out.println("��������� "+ byteRead+ " ���� ������");
				System.out.println("----------------------");
				
		
				
		
			}
		}
		} catch(Exception e){
	System.out.println(e);
		}
		}
	}
}
