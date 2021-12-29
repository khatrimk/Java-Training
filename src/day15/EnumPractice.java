package day15;

import java.util.EnumSet;

public class EnumPractice {

    public static void main(String[] args) {
        var emptyList = EnumSet.noneOf(WeekDay.class);
        var allList = EnumSet.allOf(WeekDay.class);
        var rangeList = EnumSet.range(WeekDay.WEDNESDAY, WeekDay.FRIDAY);
        var specificList = EnumSet.of(WeekDay.MONDAY,WeekDay.WEDNESDAY, WeekDay.FRIDAY);
        var complementList = EnumSet.complementOf(rangeList);

        System.out.println(emptyList);

        System.out.println(allList);
        System.out.println(rangeList);
        System.out.println(specificList);
        System.out.println(complementList);

        System.out.println(WeekDay.FRIDAY.getAbbrev());

    }
}
