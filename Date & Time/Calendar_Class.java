import java.util.Calendar;

public class Calendar_Class {
    public static void main(String[] args) {

        // ============================================================
        // java.util.Calendar - introduced to FIX some of Date's
        // problems (like extracting year/month/day properly), but
        // still considered LEGACY. java.time replaced this too.
        // ============================================================

        // Calendar is ABSTRACT - you can't do "new Calendar()".
        // Instead, use getInstance() -> a FACTORY METHOD that returns
        // a Calendar object set to the current date/time, using the
        // system's default timezone and locale.
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());   // getTime() -> converts back to a Date object

        // ------------------------------------------------------
        // Getting individual fields - this is what Calendar fixed
        // over Date's broken getYear()/getMonth() methods
        // ------------------------------------------------------
        int year = cal.get(Calendar.YEAR);          // actual year, e.g. 2026
        int month = cal.get(Calendar.MONTH);         // 0-indexed! January = 0, December = 11
        int day = cal.get(Calendar.DAY_OF_MONTH);    // day of month, 1-31
        int hour = cal.get(Calendar.HOUR_OF_DAY);    // 24-hour format hour
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // Sunday = 1, Monday = 2, ...

        System.out.println("Year: " + year);
        System.out.println("Month (0-indexed): " + month);   // NOTE the 0-indexing gotcha!
        System.out.println("Day: " + day);

        // ------------------------------------------------------
        // Setting a specific date
        // ------------------------------------------------------
        Calendar customCal = Calendar.getInstance();
        customCal.set(2026, Calendar.AUGUST, 12);  // set(year, month, day)
        // NOTE: month uses Calendar.AUGUST constant (or 7, since 0-indexed)
        // to avoid the classic "month is off by one" bug.
        System.out.println(customCal.getTime());

        // ------------------------------------------------------
        // Date arithmetic - add() modifies the Calendar IN PLACE
        // (mutable, just like Date - still a downside of legacy API)
        // ------------------------------------------------------
        customCal.add(Calendar.DAY_OF_MONTH, 10);  // add 10 days
        System.out.println(customCal.getTime());

        customCal.add(Calendar.MONTH, -1);         // subtract 1 month
        System.out.println(customCal.getTime());

        // ------------------------------------------------------
        // Comparing Calendars
        // ------------------------------------------------------
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c2.add(Calendar.YEAR, 1);

        System.out.println(c1.before(c2));   // before() -> true/false
        System.out.println(c2.after(c1));    // after()  -> true/false

        // ------------------------------------------------------
        // BOTTOM LINE: Calendar fixed field-extraction but is still
        // mutable, verbose, and has the infamous 0-indexed month trap.
        // java.time (LocalDate etc.) fixes ALL of these issues -
        // that's why it's the modern standard since Java 8.
        // ------------------------------------------------------
    }
}