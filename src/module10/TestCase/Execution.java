package module10.TestCase;

import java.io.IOException;

import module10.Action.ActionKeywords;
import module10.Utility.ExcelUtility;

public class Execution {

	public static void main(String[] args) throws IOException {
		
	String path = "D:\\Training\\Programs\\Edureka_23July\\src\\module10\\TestData\\MyDataEngine.xlsx";

	ExcelUtility.SetExcel(path, 0);
	
	for(int i=0; i<=3; i++)
	{
		String Keyword = ExcelUtility.GetData(i, 3);
		if(Keyword.equals("openbrowser"))
		{
			ActionKeywords.openbrowser();
		}
		else if(Keyword.equals("navigate"))
		{
			ActionKeywords.navigate();
		}
		else if(Keyword.equals("click_Gmail"))
		{
			ActionKeywords.click_Gmail();
		}
	}
	
	}

}
