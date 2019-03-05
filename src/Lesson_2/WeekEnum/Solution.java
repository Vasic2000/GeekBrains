package Lesson_2.WeekEnum;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.SUNDAY));
    }

    public static int getWorkingHours(DayOfWeek day){
        int hours = 0;
        boolean flag = false;
        for(DayOfWeek d : DayOfWeek.values()) {
            if(d.ordinal() >= day.ordinal()) flag = true;
            if(flag) hours += d.getWorkhours();
        }
        return hours;
    }
}
