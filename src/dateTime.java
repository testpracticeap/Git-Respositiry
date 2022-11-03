import java.time.LocalDate;
import java.time.LocalDateTime;

public class dateTime {

	public static void main(String[] args) {
	
	LocalDate date=LocalDate.now();
	LocalDate yesterday=date.minusDays(1);
	LocalDate tommorrow=yesterday.plusDays(2);
	System.out.println(date+ " \n"+yesterday+ "\n"+tommorrow);
	
	LocalDate leapdate=LocalDate.of(2016, 03, 24);
	System.out.println(leapdate.isLeapYear());
	LocalDate time=LocalDate.of(2016, 03, 24);
	LocalDateTime datetime=time.atTime(1,50,9);
	System.out.println(datetime);
	
	
	String dateString="2022-09-21";
	LocalDate parseDate=LocalDate.parse(dateString);
	System.out.println(parseDate);

	}

}
