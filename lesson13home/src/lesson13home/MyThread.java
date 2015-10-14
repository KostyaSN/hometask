package lesson13home;
	class MyThread extends Thread
	{
		private Main main;
		public void setMain(Main main){
			this.main = main;
		}
		public void run()	//Этот метод будет выполнен в побочном потоке
		{	
			for (int i =0; i<10; i++){
				main.print10();
		}	
    }
}


