package School;

public class School {
    private int studentsAmount;
    private Seasons season;

    public School(int studentsAmount, Seasons season){
        this.studentsAmount=studentsAmount;
        this.season=season;
    }
    public int getStudentsAmount() {
        return studentsAmount;
    }

    public String getSeason() {
        return season.getName();
    }
}
