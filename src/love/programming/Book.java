package love.programming;

public class Book {
    public String bookGenre;
    private String bookName;
    private String noOfPages;

    public Book(){
        this("defaultGenre","defaultName","defaultnoOfPages");

    }

    public Book(String bookGenre){
        bookGenre = bookGenre;
        System.out.println(bookGenre);
    }

    public Book(String bookGenre, String bookName){
//        this();
        this.bookGenre = bookGenre;
        this.bookName = bookName;
    }

    public Book(String bookGenre, String bookName, String noOfPages){
        this.bookGenre = bookGenre;
        this.bookName = bookName;
        this.noOfPages = noOfPages;
    }




    public void printBook(){
        System.out.println("This Book Genre is " + bookGenre+" .") ;
    }

    public void printBOok(){
        System.out.println("This Book Genre  is " +bookGenre + " ,"+"Biography of "  + bookName+" .");
    }

    public void printBoOk(){
        System.out.println("This Book is " +bookGenre +" ," +"bookName is "  +bookName +" ,"+"noOfPages are "+ noOfPages+" ." );

    }

}
