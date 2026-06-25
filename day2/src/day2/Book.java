package day2;

public class Book {
    private String title;
    private Member mbr;

    public Book(String title) {
        this.title = title;
    }

    public void status() {
        if (mbr == null)
            System.out.println(title + " not issued to any member");
        else
            System.out.println(title + " is issued to " + mbr);
    }

    public void issueTo(Member mbr) throws BookException{
        if (this.mbr != null) {
            throw new BookException(title+ " Book already issued");
        }
        else if (mbr.hasBook()) {
            throw new BookException(mbr+ " Already has a book. Return it first.");
        }
        else {
            this.mbr = mbr;
            mbr.issueBook(this);
            System.out.println(title + " Book issued successfully to " + mbr);
        }
    }
    public void returnBook() {
        mbr = null;
        System.out.println(title + " Book returned");
    }
    @Override
    public String toString() {
        return title;
    }
}