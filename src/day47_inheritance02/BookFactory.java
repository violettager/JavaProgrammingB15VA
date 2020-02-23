package day47_inheritance02;

public class BookFactory {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Jamie Chan");
        book.setPrice(11.67);
        book.setTitle("Learn Java in one day");
        book.setType("coding");

        System.out.println("-------book info-------");
        System.out.println("Autor = "+book.getAuthor());
        System.out.println("Title = "+book.getTitle());
        System.out.println("Price = "+book.getPrice());
        System.out.println("Type = "+book.getType());

        AudioBook book1 = new AudioBook();
        book1.setAuthor("Aron bay");
        book1.setPrice(4.99);
        book1.setTitle("Learn Java ");
        book1.setType("java");
        book1.setLength(14.8);
        book1.setNarrator("Wiki Won");
        System.out.println();
        System.out.println("-------Audio book info-------");
        System.out.println("Autor = "+book1.getAuthor());
        System.out.println("Title = "+book1.getTitle());
        System.out.println("Price = "+book1.getPrice());
        System.out.println("Type = "+book1.getType());
        System.out.println("Length = "+book1.getLength());
        System.out.println("Narator = "+book1.getNarrator());
        System.out.println();
        book1.listen();
    }
}
