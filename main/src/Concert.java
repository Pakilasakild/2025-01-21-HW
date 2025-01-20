import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event{



    public Concert(int id, String name, String description, LocalDate date, LocalTime time) {
        super(id, name, description, date, time);
    }
    @Override
    public String getDetails() {
        return "Concert [" + super.toString() + "]";
    }
    
}
