import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(1994, Month.FEBRUARY, 28);
        System.out.println(d);

        // LocalTime t = LocalTime.of(11,34,30,1200);
        LocalTime t = LocalTime.now(ZoneId.of("America/St_Lucia"));
        System.out.println(t);

        System.out.println(ZoneId.getAvailableZoneIds());
    }
}
