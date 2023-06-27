package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 *  날짜 : 2023/06/27
 *  이름 : 정채윤 
 *  내용 : Java Date 클래스 실습 
 */

public class DateTest {
	public static void main(String[] args) {
		
		//Date 클래
		///java.util.Date (not sql)
		Date date = new Date();
		System.out.println("date : " + date.toString());
		System.out.println("date : " + date); ///to String()같은 결과 . 현재 시간이 출력. 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		//Calendar 클래스 
		///Calendar cal = new Clendar();
		Calendar cal = Calendar.getInstance(); ///싱글
		
		int year 	= cal.get(Calendar.YEAR);
		int month 	= cal.get(Calendar.MONTH) + 1; ///1월이 0으로 나옴 
		int d 		= cal.get(Calendar.DATE);
		int hour 	= cal.get(Calendar.HOUR_OF_DAY); ///24시간 기준. 그냥 HOUR:12시가0시로 나옴.
		int min 	= cal.get(Calendar.MINUTE);
		int sec 	= cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d", year, month, d, hour, min, sec);
	}
}
