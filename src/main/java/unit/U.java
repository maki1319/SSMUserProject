package unit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class U {
     public static String getUUID(){
     	return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
	 }
	//得到String类型的特定格式的时间
	public static String formatDate() {
		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(System.currentTimeMillis()));
		return format;
	}
	
}
