package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil {
	Workbook wb;
	public ExcelFileUtil(String Excelpath) throws Throwable
	{
		properties config = new properties();
		confid.load(new FileInputStream(C:\\Users\manohar icon\\Downloads\\OJTLive-master))
		FileInputStream fi = new FileInputStream(Excelpath);
		wb=WorkbookFactory.create(fi);
	}

}
