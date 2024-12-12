package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String excelFileName) throws IOException{
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		XSSFSheet ws=wb.getSheetAt(0);
		int rowCount= ws.getLastRowNum();
		int cellCount= ws.getRow(rowCount).getLastCellNum();
		System.out.println("The total no.of.rows:"+rowCount);
		System.out.println("The total no.of.Columns:"+cellCount);
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
