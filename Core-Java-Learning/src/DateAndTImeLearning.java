
// Java code for LocalDate
// / LocalTime Function
import java.time.*;

        import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateAndTImeLearning {

    public  void LocalDateTimeApi()
    {


        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+
                date);


        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("the current time is "+
                time);



        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : "+
                current);


     //    to print in a particular format
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = current.format(format);

        System.out.println("in formatted manner "+
                formatedDateTime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-yyyy HH:mm:ss" );
        String formatedDateTime = current.format(format);
        System.out.println("*********" + formatedDateTime);

        LocalDate lastDay =
                date.with(TemporalAdjusters.
                        lastDayOfMonth());

//        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfYear());
//        LocalDate lastDay1 = date.with(TemporalAdjusters.lastDayOfMonth());
//        LocalDate lastDay2 = date.with(TemporalAdjusters.firstDayOfNextMonth());

        System.out.println("lastDayOfMonth : " +
                lastDay + " : "+ lastDay1 +" : "+ lastDay2  );



        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month : "+month+" day : "+
                day+" seconds : "+seconds);


        LocalDate date2 = LocalDate.of(1950,1,26);
        System.out.println("the republic day :"+date2);
        LocalDate date5 = LocalDate.of(1947,2,11);
        System.out.println(date5);


        LocalDateTime specificDate =
                current.withDayOfMonth(24).withYear(2016);

        System.out.println("specific date with "+
                "current time : "+specificDate);


        LocalDate nextSaturday =
                date.with(TemporalAdjusters.
                        next(DayOfWeek.SATURDAY));
       LocalDate nextSaturday1 = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("next saturday from now is "+
                nextSaturday + " : "+ nextSaturday1 );

        LocalDate date6 = LocalDate.now();
        System.out.println("current date is :" +
                date6);


        LocalDate year =
                date6.plus(1, ChronoUnit.YEARS);

        System.out.println("next to next year is " +
                year);


        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is "+
                currentZone.getZone());


        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoZone =
                currentZone.withZoneSameInstant(tokyo);

        System.out.println("tokyo time zone is " +
                tokyoZone);
    }

    public static void checkingPeriod()
    {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 =
                LocalDate.of(2014, Month.DECEMBER, 12);

        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates "+
                "is a period of "+gap);
    }


    public static void checkingDuration()
    {

        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " +
                time1);

        Duration fiveHours = Duration.ofHours(5);


        LocalTime time2 = time1.plus(fiveHours);

        System.out.println("after adding five hours " +
                "of duration " + time2);

        Duration gap = Duration.between(time2, time1);
        System.out.println("duration gap between time1" +
                " & time2 is " + gap);
    }

    // Driver code
    public static void main(String[] args)
    {
       DateAndTImeLearning dd= new DateAndTImeLearning();
       dd.LocalDateTimeApi();
        System.out.println("***************************************");
       checkingDuration();;
        System.out.println("###########################################");
       checkingPeriod();
    }
}
