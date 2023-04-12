package queue;

public class Link {
    public String dDate;
    public Link next;

    public Link(String d) {
        dDate = d;
    }

    public void displayLink() {
        System.out.print(dDate + " ");
    }
}


