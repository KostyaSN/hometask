package helpers;

import Parsers.SimpleJson;
import thread.AbsThread;

public class HJsonSimple extends AbsThread{

	public HJsonSimple(String url) {
		super(url);
	}

	@Override
	public void parsing() {
		this.setBank(SimpleJson.jsonParser(this.urlConnection()));
	}
}