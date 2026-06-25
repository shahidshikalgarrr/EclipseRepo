package day2;

public class Member {
    private String name;
    private Book title;

    public Member(String name) {
        this.name = name;
    }

    public void status() {
        if (title == null)
            System.out.println(name + " has not issued any book");
        else
            System.out.println(name + " has issued " + title);
    }

    public void issueBook(Book title) {
        if (this.title != null) {
            System.out.println("Member already has a book");
        } else {
            this.title = title;
        }
    }

    public void returnBook() {
        title = null;
        System.out.println(name + " returned book");
    }

    public boolean hasBook() {
        return title != null;
    }
    
    @Override
    public String toString() {
        return name;
    }
}