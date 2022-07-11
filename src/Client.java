public class Client {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook(1712,"Hieu",10000,"Hoc","VN","Tot");
        ProgrammingBook book2 = new ProgrammingBook(1604,"Lanh",11000,"Co","TA","Len");
        ProgrammingBook book3= new ProgrammingBook(1998,"Lam",12000,"Gang","TV","Em");
        ProgrammingBook book4 = new ProgrammingBook(2001,"Di",13000,"Len","NB","Nhe");
        ProgrammingBook book5 = new ProgrammingBook(2002,"Dinh",14000,"Em","Java","Hieu");





        FicitionBook book6 = new FicitionBook(1314,"Hoang",15000,"Nhe","Viễn tưởng 1");
        FicitionBook book7 = new FicitionBook(1711,"Hiep",160000,"Chuc","Viễn tưởng 2");
        FicitionBook book8 = new FicitionBook(1213,"Nam",17000,"Em","Viễn tưởng 3");
        FicitionBook book9 = new FicitionBook(1213,"Ba",10008,"Hanh","Viễn tưởng 4");
        FicitionBook book10 = new FicitionBook(1214,"Trong",100009,"Phuc","Viễn tưởng 5");

        double [] sumprice = {book1.getPrice(), book2.getPrice(), book3.getPrice(), book4.getPrice(), book5.getPrice(), book6.getPrice(), book7.getPrice(), book8.getPrice(), book9.getPrice(), book10.getPrice()};
        double sumpricebook =0;
        for (int i = 0; i <sumprice.length ; i++) {
            sumpricebook+=sumprice[i];
        }
        System.out.println("Tổng số tiền là "+sumpricebook+"$");
        String [] language ={book1.getLanguage(),book2.getLanguage(),book3.getLanguage(),book4.getLanguage(),book5.getLanguage()};
        int count =0;
        for (int i = 0; i < language.length; i++) {
            if ("Java".equals(language[i])) {
                count++;
            }
        }
        System.out.println("Số sách có ngôn ngữ Java "+count);
        String[] categoryB = {book6.getCategory(),book7.getCategory(),book8.getCategory(), book9.getCategory(), book10.getCategory()};
        int count1 = 0;
        for (int i = 0; i < categoryB.length; i++) {
            if ("Viễn tưởng 1".equals(categoryB[i])) {
                count1++;
            }
        }System.out.println("Sách viễn tưởng 1 là "+count1);
        double[] fBPrice = {book6.getPrice(),book7.getPrice(),book8.getPrice(),book9.getPrice(),book10.getPrice()};
        int count2 = 0;
        for (int i = 0; i <fBPrice.length; i++) {
            if (fBPrice[i] < 100) {
                count2++;
            }
        }
        System.out.println("Số tiền dưới 100 là"+count2);
    }
}
