package love.programming;

public class Country {
    public String countryName;

    private String continentName;
    private String noOfPopulation;
    private String gdpValueOfCountry;

    public Country(){
        this("defaultName","defaultcontinentName","defaultnoOfPopulation",
                "defaultgdpValueOfCountry");

    }

    public Country(String countryName){
        countryName = countryName;
        System.out.println(countryName);
    }

    public Country(String countryName, String continentName){
//        this();
        this.countryName = countryName;//
        this.continentName = continentName;
    }

    public Country(String countryName, String continentName, String noOfPopulation){
        this.countryName = countryName;
        this.continentName = continentName;
        this.noOfPopulation = noOfPopulation;
    }
    public Country(String countryName,String continentName,String noOfPopulation,String gdpValueOfCountry){
        this.countryName = countryName;
        this.continentName = continentName;
        this.noOfPopulation = noOfPopulation;
        this.gdpValueOfCountry = gdpValueOfCountry;

    }


    public void printcountry(){
        System.out.println("My Country name is " + countryName + " .");
    }

    public void printcounTry(){
        System.out.println("My Country name is  " +countryName + " ,"+"India  is in "  +continentName+" continent." );
    }

    public void printcountrY(){
        System.out.println("Details of  " +countryName +" , it is in " +continentName+
                " continent and  population of England "+ noOfPopulation+" ." );}
        public void printCountry(){
            System.out.println("Details of " + countryName +" , it is in " +continentName+ " continent ," +
                    " population and gdb values are" +noOfPopulation + " ," + gdpValueOfCountry +" .");
        }

    }

