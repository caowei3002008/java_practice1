import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException, InterruptedException {
        System.out.println("Hello World!");

        String time1 = "16:30:20";
        String time2 = "19:10:40";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        long difference = date2.getTime() - date1.getTime();
//        System.out.println(difference1);



//        try {
//
//            Date startTime = Calendar.getInstance().getTime();
//            Thread.sleep(10000);
//            Date endTime = Calendar.getInstance().getTime();
//
//            long difference = endTime.getTime() - startTime.getTime();
//
//            long differenceSeconds = difference / 1000 % 60;
//            long differenceMinutes = difference / (60 * 1000) % 60;
//            long differenceHours = difference / (60 * 60 * 1000) % 24;
//            long differenceDays = difference / (24 * 60 * 60 * 1000);
//
//            System.out.println(differenceDays + " days, ");
//            System.out.println(differenceHours + " hours, ");
//            System.out.println(differenceMinutes + " minutes, ");
//            System.out.println(differenceSeconds + " seconds.");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Date timeStart = Calendar.getInstance().getTime();
//        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        System.out.println(timeStart);
//        Thread.sleep(5000);
//        Date timeEnd = Calendar.getInstance().getTime();
//        System.out.println(timeEnd);
//        long difference = timeEnd.getTime()-timeStart.getTime();
//        System.out.println(difference);
        long diffSecond = difference/1000%60;
        long diffMinus = difference/(60*1000)%60;
        long diffHours = difference/(60*60*1000)%24;
        System.out.println(diffSecond);
        System.out.println(diffMinus);
        System.out.println(diffHours);
        String timeDurtion = diffHours+":"+diffMinus+":"+diffSecond;
        System.out.println(timeDurtion);


    }
}
