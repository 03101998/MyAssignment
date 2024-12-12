package teestng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData() throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook("./Data/Create Lead.xlsx");
		XSSFSheet ws= wb.getSheetAt(0);
		int rowCount=ws.getLastRowNum();
		int cellCount=ws.getRow(rowCount).getLastCellNum();
		
		System.out.println("The row count is:"+ rowCount);
		System.out.println("The Column count is:"+ cellCount);
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String value=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j]=value;
			}
		}
		wb.close();
		return data;
		

	}
}
