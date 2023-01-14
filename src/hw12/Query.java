package hw12;

public class Query {

    private String townName;
    private String state;

    public Query(String townName,String state){
        this.townName=townName;
        this.state=state;
    }
    public String getTownName() {
        return townName;
    }

    public String getState() {
        return state;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return townName + ", " + state;
    }
}
