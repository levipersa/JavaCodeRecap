package fundamentals.coderecap.collections;

public class Book implements Comparable<Book> {

    private int releaseDate;
    private String title;
    private String type;

    public Book(int releaseDate, String title, String type) {
        this.releaseDate = releaseDate;
        this.title = title;
        this.type = type;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "releaseDate=" + releaseDate +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {

        if (this.getReleaseDate()> o.getReleaseDate()){
            return -1;
        }
        return 1;
    }
}
