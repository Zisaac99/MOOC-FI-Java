public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String toString() {
        return this.name + " (" + this.birthYear + ")";
    }

    // let's assume that we have a list of books at our disposal
    // ArrayList<Book> books = new ArrayList<>();

    books.stream()
        .map(book -> book.getAuthor().getName() + ": " + book.getName())
        .sorted()
        .forEach(name -> System.out.println(name));
}