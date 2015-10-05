package lesson10class;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
*/

public class Main {
 
	@SuppressWarnings("unused")
	public static void main(String[] args){
		
		InputStream inputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try{
			URL url = new URL("http://tut.by");
			HttpURLConnection connection =
					(HttpURLConnection) url.openConnection();
			
		int status = connection.getResponseCode();
		 
		if(status== HttpURLConnection.HTTP_OK); {
			inputStream = connection.getInputStream();
			
			File file = new File("ttt.xml");
			
			fileOutputStream = new FileOutputStream(file);
			
			int byteRead = -1;
			byte[] bufer = new byte [4096];
			while(( byteRead = inputStream.read(bufer)) !=-1){
				fileOutputStream.write(bufer, 0, byteRead);
				System.out.println(byteRead);
			}
				
		}
	
		}
		catch(Exception e){
			
		} 
		finally {
			if(inputStream != null){
				try {
					inputStream.close();
				}catch(IOException e){
					e.printStackTrace();
					
				}
				if(fileOutputStream != null){
					try {
						fileOutputStream.close();
					}catch(IOException e){
						e.printStackTrace();
						
					}
			}
			
		}
		
	}
	
	}
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/**		List<People> list = new ArrayList<People>();
		People p1 = new People();
		p1.setName("sdfsdf");
		p1.setAge(20);
		
		People p2 = new People();
		p2.setName("sfagfsds");
		p2.setAge(50);
		
		People p3 = new People();
		p3.setName("sadfdsf");
		p3.setAge(24);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
	    Collections.sort(list, new SortByAge("a"));
		System.out.println(list.toString());
	}
	
	static class SortByAge implements Comparator<People>{


		@SuppressWarnings("unused")
		private String pattern;
		SortByAge(String pattern){
			this.pattern = pattern;
			}
		@Override
		public int compare(People o1, People o2) {
			boolean a1 =o1.getName().contains("a");
			boolean a2 =o2.getName().contains("a");
			
			
			if (a1&& a2){return o1.getName().compareTo(o2.getName());}
			if (a1) { return -1;}
			return 1;
		}
		
	/*		public int compare(People o1, People o2) {
				
				if( o1.getAge()== o2.getAge() ){ return 0;	}

				if(o1.getAge()< o2.getAge() ){return -1;	}
				
				return 0;
				
		}*/
//	 }
		
		
//		}
/*		class SortByNAme implements Comparator<People>{

			@Override
			public int compare(People o1, People o2) {
				return o1.getName().compareTo(o2.getName());}
		
	 
*/
	 
	
