package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readData(String filename) throws IOException
	{
	//open work book
	XSSFWorkbook wb=new XSSFWorkbook("./Data/"+filename+".xlsx");
	//locate the worksheet
			//wb.getSheet("Sheet1");
			XSSFSheet ws = wb.getSheetAt(0);
			//to count the number of rows including header
			int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
			System.out.println("physicalNumberOfRows "+physicalNumberOfRows);
			//to count the number of rows excluding header
			int rowCount = ws.getLastRowNum();
			System.out.println("lastRowNum"+rowCount);
			//to count the number of columns
			int columnCount = ws.getRow(0).getLastCellNum();
			System.out.println("columnCount " +columnCount);
			//to retrieve single data
			String singleData = ws.getRow(1).getCell(1).getStringCellValue();
			System.out.println("singleData "+singleData);
			String data[][]=new String[rowCount][columnCount];
			// 1 2
			for(int i=1;i<=rowCount;i++)
			{
				XSSFRow row = ws.getRow(i);
				// 0 1 2
				for(int j=0;j<columnCount;j++)
				{
					String allData = row.getCell(j).getStringCellValue();
					data[i-1][j]=allData;
					System.out.println("all data :"+allData);
				}
				
			}
			wb.close();
			return data;
			

		}
}
