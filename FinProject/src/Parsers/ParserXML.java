package Parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import Models.Bank;
import Models.Currency;

public class ParserXML extends DefaultHandler{

	
	private String element;
	private Currency currenc;
	private SimpleDateFormat format;
	private Bank bank= new Bank();;


	public ParserXML()
	{format = new SimpleDateFormat("yyyy-MM-dd");}
	@Override
	public void startElement(String namespace, String localName, String qName, Attributes attr) throws SAXException
	{element = qName;}
	@Override
	public void endElement(String namespace, String localName, String qName) throws SAXException
	{ element = ""; }
	
	@Override 
	public void characters(char[] ch,int start,int length) throws SAXException{
		
		switch(element)
		{
		
		case "bankName":
			bank.setBankName(String.valueOf(new String(ch, start,length)));
		break;
		
		case "bankLocation":
			bank.setBankLocation(new String(ch,start,length));
		break;
		
		case "date":
			try {
				bank.setDate(format.parse(new String(ch,start,length)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		
		case "baseCurrencyId":
			bank.setBaseCurrencyId(new String(ch,start,length));
			
				
			case "id":
				currenc = new Currency();
				currenc.setId(Integer.valueOf(new String(ch,start,length)));
				break;
				
			case "name":
				currenc.setName(new String(ch,start,length));
				break;
				
			case "code":
				currenc.setCode(Integer.valueOf(new String(ch,start,length)));
				break;
				
			case "rate":
				currenc.setRate(Double.valueOf(new String(ch,start,length)));
				break;
				
				
			case "visible":
				currenc.setVisible(Boolean.valueOf(new String(ch,start,length)));
				bank.setList(currenc);
				break;
		}
	}

	public Bank getBank()
	{
		return bank;
	}
}