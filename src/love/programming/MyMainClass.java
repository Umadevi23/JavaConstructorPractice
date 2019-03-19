package love.programming;

public class MyMainClass {
    public static void main(String[] args) {
        Book bookObj1 = new Book("Comedy","Horrid Henry","23");
        Book bookObj2 = new Book("Biography","Mahatma Gandhi","123");
        Book bookObj3 = new Book(" Fiction","Tom Gates","123pages");

        bookObj1.printBook();
        bookObj2.printBOok();
        bookObj3.printBoOk();


        Country countryObj1 = new Country("England","Europe");
        Country countryObj2 = new Country("India","Asia");
        Country countryObj3 = new Country("England","Europe"," :55million");
        Country countryObj4 = new Country("Australiya","Australia"," :24million",
                "  :1.5 trillion USD");
        countryObj1.printCountry();
        countryObj2.printcounTry();
        countryObj3.printcountrY();
        countryObj4.printCountry();

    }

}
