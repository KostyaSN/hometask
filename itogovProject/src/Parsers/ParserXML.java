package Parsers;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Models.Currency;

public class ParserXML extends Thread{

	@Override
	public void run() {
		
				List<Currency> list = new ArrayList<>();
				
				Document curren;
				try{
					DocumentBuilderFactory dbf = 
					DocumentBuilderFactory.newInstance();
					DocumentBuilder db =dbf.newDocumentBuilder();
					curren = db.parse("KusVal.xml");
					
						
				} catch(Exception e){
					System.out.println(e.getMessage());
					return;
				}
				
				org.w3c.dom.Element root = curren.getDocumentElement();
				
				
			NodeList bankNameNodeList = root.getElementsByTagName("bankName");
				Node nameNode = bankNameNodeList.item(0);
				String fileName = nameNode.getFirstChild().getNodeValue();
				System.out.println("�������� ����� " + fileName );
				
				
				NodeList bankLocationNodeList = root.getElementsByTagName("bankLocation");
				Node nameNode1 = bankLocationNodeList.item(0);
				String fileName1 = nameNode1.getFirstChild().getNodeValue();
				System.out.println("������������ �����: "+fileName1);
				
				
				NodeList dateNodeList = root.getElementsByTagName("date");
				Node nameNode2 = dateNodeList.item(0);
				String fileName2 = nameNode2.getFirstChild().getNodeValue();
				System.out.println("���� ���������� ������ "+fileName2);
				
				
				NodeList baseCurrencyIdNodeList = root.getElementsByTagName("baseCurrencyId");
				Node nameNode3 = baseCurrencyIdNodeList.item(0);
				String fileName3 = nameNode3.getFirstChild().getNodeValue();
				System.out.println("ID ����� :"+fileName3);
				

				NodeList currencyList = root.getElementsByTagName("currency");
				
				Node currencyNode = currencyList.item(0);
				
				NodeList elementsNodeList = currencyNode.getChildNodes();
				
				System.out.println("------------------------------");
				for (int i =0; i<elementsNodeList.getLength(); i++){
					Node item = elementsNodeList.item(i);
					
				if(	item.getNodeType()!= Node.ELEMENT_NODE){
					continue;
				}
				
				Currency element = new Currency();
				org.w3c.dom.Element nameEl =(org.w3c.dom.Element)item;
			
				
			String name =
						nameEl
						.getElementsByTagName("name")
						.item(0)
						.getTextContent();
			System.out.println("������ "+ name);
			element.setName(name);	
				
			String id =
					nameEl
					.getElementsByTagName("id")
					.item(0)
					.getTextContent();
			System.out.println("id ������ "+ id);
			element.setId(Integer.valueOf(id));
			
			String code =
					nameEl
					.getElementsByTagName("code")
					.item(0)
					.getTextContent();
			System.out.println("��� ������ "+ code);
			element.setCode(Integer.valueOf(code));
			
			String rate = 
					nameEl
					.getElementsByTagName("rate")
					.item(0)
					.getTextContent();
			System.out.println("��������� "+rate);
			element.setRate(Double.valueOf(rate));
			
			
			String visible =
					nameEl
					.getElementsByTagName("visible")
					.item(0)
					.getTextContent();
			System.out.println("����������� "+ visible);
			element.setVisible(Boolean.valueOf(visible));
				
			list.addAll(list);
				
				System.out.println("===============");
				}
				for(int i=0; i<list.size(); i++){
					System.out.println(list+"xml");
				}
				
				
			}
		}

		
