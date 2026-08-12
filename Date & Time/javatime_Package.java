import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class javatime_Package {
    public static void main(String[] args) {

        // ============================================================
        // java.time - the MODERN date/time API, introduced in Java 8.
        // Fixes everything wrong with Date/Calendar:
        //  - IMMUTABLE (every method returns a NEW object, never
        //    modifies the original - thread-safe, no accidental bugs)
        //  - Clear separation: date-only, time-only, date+time
        //  - No confusing 0-indexed months
        //  - Human-readable, fluent method names
        // ============================================================


        // ------------------------------------------------------
        // LocalDate - DATE ONLY (year, month, day). No time, no timezone.
        // ------------------------------------------------------
        LocalDate today = LocalDate.now();              // now() -> current date
        LocalDate specificDate = LocalDate.of(2026, 8, 12); // of(year, month, day) - month is 1-12, NOT 0-indexed!
        System.out.println(today);
        System.out.println(specificDate);   // 2026-08-12 (ISO format by default)


        // ------------------------------------------------------
        // LocalTime - TIME ONLY (hour, minute, second). No date.
        // ------------------------------------------------------
        LocalTime now = LocalTime.now();
        LocalTime specificTime = LocalTime.of(14, 30);   // of(hour, minute) - 24hr format
        System.out.println(now);
        System.out.println(specificTime);   // 14:30


        // ------------------------------------------------------
        // LocalDateTime - DATE + TIME together, no timezone.
        // ------------------------------------------------------
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime specificDT = LocalDateTime.of(2026, 8, 12, 14, 30);
        System.out.println(dateTime);
        System.out.println(specificDT);


        // ------------------------------------------------------
        // Getting individual fields - no deprecated methods, no
        // +1900 nonsense like Date had.
        // ------------------------------------------------------
        System.out.println(today.getYear());         // 2026
        System.out.println(today.getMonth());         // AUGUST (an enum, not a number)
        System.out.println(today.getMonthValue());    // 8 (numeric, 1-indexed - no off-by-one trap)
        System.out.println(today.getDayOfMonth());    // 12
        System.out.println(today.getDayOfWeek());     // WEDNESDAY (an enum)


        // ------------------------------------------------------
        // Date/time arithmetic - IMMUTABLE, so you must capture the
        // RETURNED value. The original object is never changed.
        // ------------------------------------------------------
        LocalDate nextWeek = today.plusDays(7);        // plusDays() -> new LocalDate, 7 days ahead
        LocalDate lastMonth = today.minusMonths(1);    // minusMonths() -> new LocalDate, 1 month back
        LocalDate nextYear = today.plusYears(1);
        System.out.println(nextWeek);
        System.out.println(lastMonth);

        // today.plusDays(7);   // <- this line alone does NOTHING useful,
        // since LocalDate is immutable - the result is thrown away
        // unless you assign it to a variable, like above.


        // ------------------------------------------------------
        // Comparing dates
        // ------------------------------------------------------
        LocalDate d1 = LocalDate.of(2026, 1, 1);
        LocalDate d2 = LocalDate.of(2026, 6, 1);

        System.out.println(d1.isBefore(d2));   // isBefore() -> true/false
        System.out.println(d1.isAfter(d2));    // isAfter()  -> true/false
        System.out.println(d1.isEqual(d2));    // isEqual()  -> true/false


        // ------------------------------------------------------
        // Period - represents a DIFFERENCE between two DATES
        // (in years, months, days)
        // ------------------------------------------------------
        Period period = Period.between(d1, d2);
        System.out.println(period);                 // P5M (5 months)
        System.out.println(period.getMonths());     // 5


        // ------------------------------------------------------
        // Duration - represents a DIFFERENCE between two TIMES
        // (in hours, minutes, seconds) - used with LocalTime/LocalDateTime
        // ------------------------------------------------------
        LocalTime t1 = LocalTime.of(9, 0);
        LocalTime t2 = LocalTime.of(17, 30);
        Duration duration = Duration.between(t1, t2);
        System.out.println(duration.toHours());     // 8
        System.out.println(duration.toMinutes());    // 510


        // ------------------------------------------------------
        // ChronoUnit - flexible way to measure difference in a
        // SPECIFIC unit (days, months, years, etc.) between two dates
        // ------------------------------------------------------
        long daysBetween = ChronoUnit.DAYS.between(d1, d2);
        System.out.println(daysBetween);    // number of days between d1 and d2


        // ------------------------------------------------------
        // DateTimeFormatter - controls how dates are displayed/parsed
        // (String <-> LocalDate/LocalDateTime conversion)
        // ------------------------------------------------------
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = today.format(formatter);   // format() -> LocalDate to String
        System.out.println(formatted);                 // 12-08-2026

        LocalDate parsed = LocalDate.parse("25-12-2026", formatter); // parse() -> String to LocalDate
        System.out.println(parsed);


        // ------------------------------------------------------
        // BOTTOM LINE / WHY java.time OVER Date & Calendar:
        //  - Immutable -> no accidental modification bugs
        //  - Separate classes for date-only / time-only / both
        //  - 1-indexed months (no off-by-one bugs)
        //  - Built-in comparison (isBefore/isAfter/isEqual)
        //  - Built-in arithmetic (plusDays/minusMonths etc.)
        //  - Period/Duration/ChronoUnit for measuring differences
        //  - DateTimeFormatter for clean String conversion
        // This is the STANDARD to use in any new Java code (Java 8+).
        // ------------------------------------------------------
    }
}