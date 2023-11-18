import java.time.Duration;
import java.time.LocalDateTime;

public class dateTime03 {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.of(1998,6, 16, 20, 00 );
        LocalDateTime currentDate = LocalDateTime.now();
        Duration duration= Duration.between(startDate,currentDate);
        long day = duration.toDays();
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        System.out.println("dogumumdan bugune "+day+".gün "+hours+"saat "+minutes+"dakika "+seconds+"sanıye gerıde kaldı");
    }
}
