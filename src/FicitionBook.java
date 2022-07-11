public class FicitionBook extends Book{
    private String category;
    public FicitionBook(){

    }
    public FicitionBook(int bookcode, String name, double price, String author, String category) {
        super(bookcode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
