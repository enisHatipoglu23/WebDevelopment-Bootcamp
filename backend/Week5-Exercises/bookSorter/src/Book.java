public class Book implements Comparable<Book>{
    private String name;
    private int pageNumber;
    private String author;
    public Book(String name, int pageNumber, String author) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
    }
    // first case sorts in alphabetical order
    // second case is if name's equal sorts in page order
    @Override
    public int compareTo(Book o) {
        if(!o.getName().equalsIgnoreCase(this.getName())){
            return (this.getName().compareTo(o.getName()));
        }else{
            return Integer.compare(this.getPageNumber(), o.getPageNumber());
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", pageNumber=" + getPageNumber() +
                ", author='" + getAuthor() + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public String getAuthor() {
        return author;
    }
}