package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

public class PDFReadMavenTest {
	@Test
	public void certificate() throws IOException, SAXException, TikaException {
		BodyContentHandler contentHandler=new BodyContentHandler();
		FileInputStream fis=new FileInputStream("./src/main/resources/TestData/employment certificate.pdf");
		Metadata metadata=new Metadata();
		ParseContext pasecontext=new ParseContext();
		PDFParser parse=new PDFParser();
		parse.parse(fis,contentHandler,metadata,pasecontext);
		System.out.println(contentHandler.toString());
	}

}
