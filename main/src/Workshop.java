import java.time.LocalDate;
import java.time.LocalTime;

public class Workshop extends Event{


    public Workshop(int id, String name, String description, LocalDate date, LocalTime time) {
        super(id, name, description, date, time);
    }
    @Override
    public String getDetails() {
        return "Workshop [" + super.toString() + "]";
    }
}
