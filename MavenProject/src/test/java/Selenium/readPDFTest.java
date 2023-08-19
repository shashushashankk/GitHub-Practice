package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

public class readPDFTest {
	@Test
	public  void main() throws IOException, SAXException, TikaException {
		BodyContentHandler contentHandler=new BodyContentHandler();
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Provisional Certificate Suman K K.pdf");
		Metadata metadata=new Metadata();
		ParseContext parsecontext=new ParseContext();
		PDFParser parse=new PDFParser();
		parse.parse(fis, contentHandler, metadata, parsecontext);
		System.out.println(contentHandler.toString());
	}
}
