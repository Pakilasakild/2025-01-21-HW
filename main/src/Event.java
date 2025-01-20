import java.time.LocalDate;
import java.time.LocalTime;

abstract class Event {
    private int id;
    private String name;
    private String description;
    private LocalDate date;
    private LocalTime time;



    public Event() {
    }

    
    public Event(int id, String name, String description, LocalDate date, LocalTime time) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public LocalDate getDate() {
        return date;
    }


    public LocalTime getTime() {
        return time;
    }


    abstract String getDetails();


    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", time="
                + time + "]";
    }
    
}
