 package baseClass;

import java.io.FileInputStream;
import java.io.IOException;



import configurations.ConfigPaths;

public class Utility {
	
public static String readexcel (int row, int col) throws  IOException{
		
		FileInputStream file = new FileInputStream(ConfigPaths.excelSheet);

		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = data.getRow(row).getCell(col).getStringCellValue();
		
		return value;
	}


}
