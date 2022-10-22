package HomeWork1;

public class Track {
    String result;
    private int TrackFirst;
    private int TrackSecond;
    private int TrackThird;

    public Track(int TrackFirst, int TrackSecond, int TrackThird){
        this.TrackFirst = TrackFirst;
        this.TrackSecond = TrackSecond;
        this.TrackThird = TrackThird;
    }

    public String doIt(Team teams){
        result = "Команда: " + teams.getName() + " " + '\n';
        for (Teammate teammates: teams.getPeoples()){
            result += "имя участника: " + teammates.getName()+ " " + '\n';
            int value = teammates.getDistance();

            testTrackFirst(value);
            testTrackSecond(value);
            testTrackThird(value);

        }

        return result;
    }

    private void testTrackFirst(int value){
        if(value >= TrackFirst) result += "Пробежал первую трассу "+ '\n';
        else result += "Не пробежал первую трассу "+ '\n';

    }

    private void testTrackSecond(int value){
        if(value >= TrackSecond) result += "Пробежал вторую трассу "+ '\n';
        else result += "Не пробежал вторую трассу "+ '\n';
    }

    private void testTrackThird(int value){
        if(value >= TrackThird) result += "Пробежал третью трассу "+ '\n';
        else result += "Не пробежал третью трассу "+ '\n';
    }
}
