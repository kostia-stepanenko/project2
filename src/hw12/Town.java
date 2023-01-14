package hw12;

public class Town {
    private String zipCode;
    private String name;
    private String state;
    private String phoneAreaCode;
    private String country;
    private String timeZone;
    private String population;


    public Town(String zipCode,String name,String state,
                String phoneAreaCode,String country,String timeZone,String population){
        this.zipCode=zipCode;
        this.name=name;
        this.state=state;
        this.phoneAreaCode=phoneAreaCode;
        this.country=country;
        this.timeZone=timeZone;
        this.population=population;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public String getCountry() {
        return country;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getPopulation() {
        return population;
    }
}
