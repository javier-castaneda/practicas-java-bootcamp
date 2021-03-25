package ejercicioSorters;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Timer {

    private long startTime;
    private long endTime;

    public Timer() {
        this.startTime = 0;
        this.endTime = 0;
    }

    public void start(){
        LocalDateTime ldt = LocalDateTime.of(LocalDateTime.now().getYear(),
                LocalDateTime.now().getMonth(),
                LocalDateTime.now().getDayOfMonth(),
                LocalDateTime.now().getHour(),
                LocalDateTime.now().getMinute(),
                LocalDateTime.now().getSecond(),
                LocalDateTime.now().getNano());
        ldt = ldt;
        long millisSinceEpoch = ldt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.startTime = millisSinceEpoch;
    }

    public void stop(){
        LocalDateTime ldt = LocalDateTime.of(LocalDateTime.now().getYear(),
                LocalDateTime.now().getMonth(),
                LocalDateTime.now().getDayOfMonth(),
                LocalDateTime.now().getHour(),
                LocalDateTime.now().getMinute(),
                LocalDateTime.now().getSecond(),
                LocalDateTime.now().getNano());
        ldt = ldt;
        long millisSinceEpoch = ldt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.endTime = millisSinceEpoch;
    }

    public long elapsedTime(){
        if(startTime>0 && endTime>0) {
            return endTime - startTime;
        }
        return 0;
    }
}
