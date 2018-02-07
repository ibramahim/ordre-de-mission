package classesForImplementsControllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Sortie {
	public static boolean isSupperieurOfToday(String date){
		SimpleDateFormat laforme = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return new Date().after(laforme.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
