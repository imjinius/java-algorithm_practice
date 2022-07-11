import java.util.Calendar;
import java.util.Date;

public class DateFunction {

    public static void main(String[] args) {
        Date date = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        // 날짜 계산하는 메서드
        cal.add(Calendar.DAY_OF_MONTH, -4);
        int day = cal.get(Calendar.DAY_OF_WEEK);

        // 0부터 시작하기 때문에 +1
        int month = cal.get(Calendar.MONTH) + 1;

        System.out.println(day);
        System.out.println(month);

    }
}