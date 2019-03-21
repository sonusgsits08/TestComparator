import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
public static void main(String[] args) {	
	try {
		String strDate = "2018-12-04";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date utilDate = sd.parse(strDate);		
		
		//String to sql date
		java.sql.Date sqlDate = java.sql.Date.valueOf(strDate);		
		System.out.println("sqlDate:"+sqlDate);				
		
		// using method for sql date 
		TestDate td = new TestDate();
		java.sql.Date sqlDatefromMethod = td.convertJavaDateToSqlDate(utilDate);
		System.out.println("sqlDatefromMethod:"+sqlDatefromMethod);				
	} catch (ParseException e) {
		
		e.printStackTrace();
	}	
}
public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
}
}
