package top.zxh.spring.ioc.iocExercise2;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class Book {
    private Book book;
    private String id;
    private String name;
    private Double price;

    public Book() {

    }

    public Book(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Book{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}
