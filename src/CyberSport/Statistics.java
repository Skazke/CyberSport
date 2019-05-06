package CyberSport;

public  class Statistics {
    private int p;
    private String major;
    static int  place;



    public Statistics(int place) {


    }
    public int getPlace() {

        return place;


    }

    public void setPlace(int place) {
        this.place = place;

    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        major = major;
    }

    public Statistics(int place, String major) {
        this.place = place;
        this.major = major;
    }

}
