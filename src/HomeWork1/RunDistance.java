package HomeWork1;

public class RunDistance {
    public static void main(String[] args) {
        Teammate[] teammates = new Teammate[4];
        teammates[0] = new Teammate("Василий", 150);
        teammates[1] = new Teammate("Игорь", 50);
        teammates[2] = new Teammate("Святослав", 200);
        teammates[3] = new Teammate("Геннадий", 300);
        Team teams = new Team("Чемпионы", teammates);

        Track tracks = new Track(100, 200, 300);
        String result = tracks.doIt(teams);
        System.out.println(result);
    }
}
