import java.util.ArrayDeque;
import java.util.Deque;

public class MusicPlaylist {
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String page) {
        history.push(page);
        currentPage = page;
    }

    public void goBack() {
        if (history.size() > 1) {
            history.pop();
            currentPage = history.peek();
        } else {
            System.out.println("No previous page.");
        }
    }

    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No pages visited.");
        }
    }

    public static void main(String[] args) {
        MusicPlaylist bh = new MusicPlaylist();
        bh.visitPage("Page 1");
        bh.visitPage("Page 2");
        bh.displayCurrentPage();
        bh.goBack();
        bh.displayCurrentPage();
    }
}
