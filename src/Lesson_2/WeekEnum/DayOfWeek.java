package Lesson_2.WeekEnum;

public enum DayOfWeek {
    MONDAY(8),
    TUESDAY( 8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(7),
    SATURDAY(0),
    SUNDAY(0);


    private int workhours;

    DayOfWeek(int workhours) {
        this.workhours = workhours;
    }

    public int getWorkhours() {
        return workhours;
    }
}
