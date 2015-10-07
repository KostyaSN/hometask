package lesson11class;

import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args){
		List<myElement> list = new ArrayList<>();
		
		Document dom;
		try{
			DocumentBuilderFactory dbf = 
			DocumentBuilderFactory.newInstance();
			DocumentBuilder db =dbf.newDocumentBuilder();
			dom = db.parse("test.xml");
			
				
		} catch(Exception e){
			System.out.println(e.getMessage());
			return;
		}
		
		org.w3c.dom.Element root = dom.getDocumentElement();
		System.out.println("ROOT = "+root.getTagName());
		
		NodeList nameNodeList = 
				root.getElementsByTagName("name");
		
		Node nameNode = nameNodeList.item(0);
		
		System.out.println("Name TAG = "+nameNode.getNodeName());
		
		
		
		String fileName = nameNode.getFirstChild().getNodeValue();
		System.out.println("Name = " + fileName );
		
		String idName = nameNode.getAttributes().getNamedItem("idN").toString();
		System.out.println( idName);
		
		NodeList peopleList = root.getElementsByTagName("people");
		
		Node peopleNode = peopleList.item(0);

		System.out.println("People TAG = " + peopleNode.getNodeName());
		
		NodeList elementsNodeList = peopleNode.getChildNodes();
		System.out.println("===============");
		for (int i =0; i<elementsNodeList.getLength(); i++){
			Node item = elementsNodeList.item(i);
			
		if(	item.getNodeType()!= Node.ELEMENT_NODE){
			continue;
		}
		
		myElement element = new myElement();
		org.w3c.dom.Element nameEl =(org.w3c.dom.Element)item;
		//name
/*		NodeList nameList = nameEl.getElementsByTagName("name");
		org.w3c.dom.Element nameElement =(org.w3c.dom.Element) nameList.item(0);
		String nameString = nameElement.getFirstChild().getNodeValue();
		System.out.println("Name = "+ nameString);
		element.setName(nameString); */
		
		
	String name =
				nameEl
				.getElementsByTagName("name")
				.item(0)
				.getTextContent();
	System.out.println("name = "+ name);
	element.setName(name);	
		
	String surname =
			nameEl
			.getElementsByTagName("surname")
			.item(0)
			.getTextContent();
	System.out.println("Surname = "+ surname);
	element.setSurname(surname);
	
	String age =
			nameEl
			.getElementsByTagName("age")
			.item(0)
			.getTextContent();
	System.out.println("Surname = "+ age);
	element.setAge(Integer.valueOf(age));
	
	String isDegree =
			nameEl
			.getElementsByTagName("isDegree")
			.item(0)
			.getTextContent();
	System.out.println("Surname = "+ isDegree);
	element.setDegree(Boolean.valueOf(isDegree));
		
	list.addAll(list);
		
		System.out.println("===============");
		}
		
		
	}
}
