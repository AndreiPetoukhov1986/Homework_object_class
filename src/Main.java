public class Main {
    public static void main(String[] args) {
       Author pushkin = new Author("Александр", "Пушкин");
       Author noses = new Author("Николай", "Носов");

       Book dreamers = new Book("Фантазеры",noses,1940);
       Book eugeneOnegin = new Book("Евгений Онегин",pushkin,1822);

       dreamers.printInfoBook();
       eugeneOnegin.printInfoBook();

       eugeneOnegin.setPublicationYear(1900);

       eugeneOnegin.printInfoBook();
    }
}