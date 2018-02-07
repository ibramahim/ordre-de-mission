package DataBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LaDate {
	public int day;
	public int month;
	public int year;

	public static void main(String[] args){
		SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(simpledateformat.format(new Date()));
		try {
			Date d;
			d = simpledateformat.parse("15/11/1994");
			System.out.println(d);
			System.out.println(new Date().after(simpledateformat.parse("03/03/2018")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
