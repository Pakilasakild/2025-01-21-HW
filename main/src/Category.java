import java.util.ArrayList;
import java.util.List;

public class Category {
    private String title;
    private String description;
    private List<Event> events;



    public Category(String title, String description) {
        this.title = title;
        this.description = description;
        this.events = new ArrayList<>();
    }


    public void addEvent(Event event) {
        events.add(event);
    }

    public String getCategoryInfo() {
        StringBuilder info = new StringBuilder("Category: " + title + "\nDescription: " + description + "\nEvents:\n");
        for (Event event : events) {
            info.append(event.getDetails());
            info.append("\n");
        }
        return info.toString();
    }
    
}
