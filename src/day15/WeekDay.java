package day15;

public enum WeekDay {
    SUNDAY("sun", 1), MONDAY("mon",2),TUESDAY("tues",3),WEDNESDAY("wed",4), THURSDAY("thu",5), FRIDAY("fri",6), SATURDAY("say",7);


    private String abbrev;
    private int count;

    WeekDay(String abbrev, int count) {
        this.abbrev = abbrev;
        this.count = count;
    }

    public String getAbbrev(){
        return abbrev;
    }
}

