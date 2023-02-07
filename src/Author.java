import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author (String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
    @Override
    public boolean equals (Object a){
        if (this==a) {
            return true;
        }
        if (a==null || getClass()!=a.getClass()) {
            return false;
        }
        Author author = (Author) a;
        return name.equals(author.name)&&surname.equals(author.surname);
        }
        
        @Override
    public int hashCode(){
        return Objects.hash(name, surname);
        }
        
    }



