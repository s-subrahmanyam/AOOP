import java.util.LinkedList;
import java.util.Queue;

public class SupportTicketSystem {
    private Queue<String> tickets = new LinkedList<>();

    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    public void processTicket() {
        if (!tickets.isEmpty()) {
            System.out.println("Processing ticket: " + tickets.poll());
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayTickets() {
        System.out.println("Pending tickets: " + tickets);
    }

    public static void main(String[] args) {
        SupportTicketSystem st = new SupportTicketSystem();
        st.addTicket("Ticket 1");
        st.addTicket("Ticket 2");
        st.displayTickets();
        st.processTicket();
        st.displayTickets();
    }
}
