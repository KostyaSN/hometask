
package helpers;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import Parsers.ParserXML;
import thread.AbsThread;

public class HXml extends AbsThread{
	

	public HXml(String url) {
		super(url);
	}

	@Override
	public void parsing() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		ParserXML parserXML = new ParserXML();
		
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(this.getUrl(), parserXML);
			this.setBank(parserXML.getBank());
			
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (SAXException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
