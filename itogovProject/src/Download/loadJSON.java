package download;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class loadJSON extends Thread {

		@Override
			
		public void run() {
			
			InputStream inputStream = null;
			FileOutputStream fileOutputStream = null;
			
			try{
				System.out.println("Идет получение данных");
				URL url = new URL("http://kiparo.ru/t/currency.json"); //откуда прриходит файл, его адрес в интернете
				HttpURLConnection connection =
						(HttpURLConnection) url.openConnection();
				
			int status = connection.getResponseCode();
			 
			if(status== HttpURLConnection.HTTP_OK); {
				inputStream = connection.getInputStream();
				
				File file = new File("KusVal.json");// создаем файл который скачали 
				
				fileOutputStream = new FileOutputStream(file);
					
				int byteRead = -1;
				byte[] bufer = new byte [4096]; // устанавливаем размер буфера данных для закачки
				while(( byteRead = inputStream.read(bufer)) !=-1){
					fileOutputStream.write(bufer, 0, byteRead);// получаем количество байт полученных программой
					System.out.println("Полученно "+ byteRead+ " байт данных");
					System.out.println("----------------------");
				}
				}
			
			} catch(Exception e){
		System.out.println(e);
			
			
		}}}



