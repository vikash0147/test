package Testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test3 {


	public static String getcallvalue(Cell c) {

		String value = null;

		switch(c.getCellType()){

		case Cell.CELL_TYPE_STRING :

			value = c.getStringCellValue();

			break;

		case Cell.CELL_TYPE_NUMERIC :
			value =  String.valueOf(c.getNumericCellValue());

			break;

		default :
			value= null;
			break;

		}
		return value;
	}


	public static void main(String args[]) throws InvalidFormatException, IOException {

		//	File f = new File("C:\\Users\\Admin\\Downloads\\ADHOC.xlxs");
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Downloads\\ADHOC.xlsx");


			XSSFWorkbook  wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("vikash");
			int row = sheet.getLastRowNum();
			System.out.println("Last Row Number"+ row);
			for(int i=0;i<row; i++) {

				System.out.println("Row Number"+ i);


				short minColIx = sheet.getRow(i).getFirstCellNum();
				//System.out.println("minColIx" + minColIx);
				short maxColIx = sheet.getRow(i).getLastCellNum();
				//System.out.println("maxColIx" + maxColIx);
				for(short colIx=minColIx; colIx<maxColIx; colIx++) {
					XSSFCell cell = sheet.getRow(i).getCell(colIx);
					if(cell == null) {
						continue;}
					else {
						HashMap<String , String> hmap = new HashMap<String , String>();

						hmap.put(getcallvalue(sheet.getRow(i).getCell(minColIx)), getcallvalue(sheet.getRow(i).getCell(minColIx+1)));

						Set s1 = hmap.entrySet();

						Iterator itr = s1.iterator();

						while(itr.hasNext()) {

							Map.Entry entry = (Map.Entry)itr.next();
							String Key = (String) entry.getKey();
							String values = (String) entry.getValue();
							System.out.print("Key" + ":-" +Key );
							//System.out.println("values" + ":-" +values );
							//System.out.println(Key + ":-" +values );

						}
					}
				}

			}


			wb.close();

		}

		catch(Exception e) {

			e.printStackTrace();

		}

	}
}


