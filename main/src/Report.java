import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<Event> events;

    public Report(List<Event> events) {
        this.events = events;
    }

    public List<Event> generateReportByDate(LocalDate startDate, LocalDate endDate) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if ((event.getDate().isEqual(startDate) || event.getDate().isAfter(startDate)) &&
                    (event.getDate().isEqual(endDate) || event.getDate().isBefore(endDate))) {
                result.add(event);
            }
        }
        return result;
    }

    public List<Event> findEventByName(String namePart) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if (event.getName().toLowerCase().contains(namePart.toLowerCase())) {
                result.add(event);
            }
        }
        return result;
    }

    public Event findEventById(int eventId) {
        for (Event event : events) {
            if (event.getId() == eventId) {
                return event;
            }
        }
        return null;
    }
}
