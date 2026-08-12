import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {

        // ============================================================
        // java.util.Date - the OLDEST date class in Java (since JDK 1.0)
        // Mostly considered LEGACY now - java.time is preferred.
        // Kept here because you'll still see it in older code/tutorials.
        // ============================================================

        // Date() -> creates a Date object representing the CURRENT
        // date AND time at the moment this line runs.
        Date now = new Date();
        System.out.println(now);
        // prints something like: Wed Aug 12 14:30:00 IST 2026

        // ------------------------------------------------------
        // PROBLEM 1: Date represents BOTH date and time together -
        // you can't have "just a date" or "just a time" like in
        // java.time (LocalDate vs LocalTime).
        // ------------------------------------------------------

        // ------------------------------------------------------
        // PROBLEM 2: Date is MUTABLE - methods like setTime() can
        // change the object after creation. This can cause bugs if
        // the same Date object is shared/passed around and modified
        // unexpectedly elsewhere.
        // ------------------------------------------------------
        now.setTime(0L);   // sets Date to Jan 1, 1970 00:00:00 UTC (epoch)
        System.out.println(now);

        // getTime() -> returns milliseconds since Jan 1, 1970 UTC
        // (called "epoch time" or "Unix time")
        Date d2 = new Date();
        long millis = d2.getTime();
        System.out.println(millis);

        // ------------------------------------------------------
        // PROBLEM 3: most useful methods (getYear, getMonth, getDay
        // etc.) are DEPRECATED - Java itself warns you not to use
        // them because they behave weirdly:
        // getYear() returns (actual year - 1900), NOT the real year!
        // ------------------------------------------------------
        // System.out.println(d2.getYear() + 1900);  // deprecated, don't use

        // ------------------------------------------------------
        // Comparing two dates
        // ------------------------------------------------------
        Date past = new Date(0L);       // Jan 1, 1970
        Date present = new Date();      // now

        System.out.println(past.before(present));  // before() -> true/false
        System.out.println(present.after(past));   // after()  -> true/false
        System.out.println(past.equals(present));  // equals() -> true/false

        // ------------------------------------------------------
        // BOTTOM LINE: Date is confusing, mutable, and mostly
        // deprecated for anything beyond "give me current timestamp".
        // Use java.time (LocalDate/LocalDateTime) for real work -
        // see JavaTimeDemo.java notes.
        // ------------------------------------------------------
    }
}