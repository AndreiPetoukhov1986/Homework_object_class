import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book (String title, Author author, int publicationYear){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }
    public void printInfoBook(){
        System.out.println("Автор: "+getAuthor().getName() +" "+ getAuthor().getSurname() + " Название книги: "+getTitle()+" Год издания: "+getPublicationYear());
    }

    @Override
    public String toString(){
        return  "Автор: "+author+" Название книги: "+title+" Год издания: "+publicationYear;
    }

    @Override
    public boolean equals (Object a){
        if (this==a) {
            return true;
        }
        if (a==null || getClass()!=a.getClass()) {
            return false;
        }
        Book book = (Book) a;
        return title.equals(book.title) && publicationYear == book.publicationYear && author.equals(book.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author, publicationYear);
    }
}
