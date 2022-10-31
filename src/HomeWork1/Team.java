package HomeWork1;

public class Team {
    private String name;
    private Teammate[] peoples;

    public Team(String name, Teammate[] peoples){
        this.name = name;
        this.peoples = peoples;
    }

    public String getName() { return name;}

    public Teammate[] getPeoples() { return  peoples;}
}
