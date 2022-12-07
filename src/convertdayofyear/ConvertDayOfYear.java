
package convertdayofyear;


public class ConvertDayOfYear {

    
    public static void main(String[] args) {
        int year = 1999;
        int dayNum = 91;
        int monthNum = 0;
        int[] daySinMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months = {"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};
        boolean isLeapYear = (year % 4 == 0) && (year%100 != 0 || year%400 == 0);
        for (int days : daySinMonth) {
            if(isLeapYear && days == 28) days++;
            if(dayNum <= days) break;
            dayNum -= days;
            monthNum ++;
        }
        System.out.println(dayNum + " " + months[monthNum]);
    }
    
}
