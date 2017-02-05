package keywords;

import edu.jsu.mcis.*;
import org.json.simple.parser.*;

public class CSVJSONKeywords {
	private Converter converter;

	public CSVJSONKeywords() {
		converter = new Converter();
	}
    
    public String convertToJson(String csv) {
        return converter.csvToJson(csv);
    }
    
    public String convertToCsv(String json) {
        return converter.jsonToCsv(json);
    }
    
    public boolean jsonStringsAreEqual(String s, String t) {
        JSONParser parser = new JSONParser();
		try{
			Object sObj = parser.parse(s);
			Object tObj = parser.parse(t);
			return sObj.equals(tObj);
		}
		catch(ParseException e) {return false;}
    }
}