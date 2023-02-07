public class Main {
    public static void main(String[] args) {
       Author pushkin = new Author("Александр", "Пушкин");
       Author noses = new Author("Николай", "Носов");
       Author noses2 = new Author("Николай", "Носов");

        System.out.println(noses.equals(noses2));

       Book dreamers = new Book("Фантазеры",noses,1940);
       Book eugeneOnegin = new Book("Евгений Онегин",pushkin,1822);

        System.out.println(dreamers.equals(eugeneOnegin));


       System.out.println(dreamers);
       System.out.println(eugeneOnegin);

       eugeneOnegin.setPublicationYear(1900);

       System.out.println(eugeneOnegin);

        System.out.println(eugeneOnegin.hashCode());
        System.out.println(noses2.hashCode());
        System.out.println(noses.hashCode());



    }
}