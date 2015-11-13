package helpers;

import Parsers.ParserJson;
import thread.AbsThread;

public class HJsonGson extends AbsThread{
	

	public HJsonGson(String url) {
		super(url);
	}

	@Override
	public void parsing() {
		this.setBank(ParserJson.gsonParser(this.urlConnection()));
	}
}