package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import Models.Bank;

public abstract class AbsThread extends Thread{

	private Bank bank;
	private String urlDocument;
	
	public AbsThread(String url)
	{this.setUrl(url);}
	
	public Bank getBank() {
		return bank;}

	public void setBank(Bank bank) {
		this.bank = bank;}

	public String getUrl() {
		return urlDocument;}

	public void setUrl(String url) {
		this.urlDocument = url;}
	
	
	@Override
	public void run() {
		parsing();}

	public BufferedReader urlConnection()
	{
		URL url;
		HttpURLConnection connection;
		BufferedReader input = null;
		
		try {
			url = new URL(urlDocument);
			connection = (HttpURLConnection)url.openConnection();
			input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}	 
		
		return input;
	}
	
	
	public abstract void parsing();
	}