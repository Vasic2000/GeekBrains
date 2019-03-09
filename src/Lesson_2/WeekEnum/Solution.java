package Lesson_2.WeekEnum;

public class Solution {

//    Урок 2. Исключения
//
//    Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//    С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
//
//    Возвращает кол-во оставшихся рабочих часов до конца
//    недели по заданному текущему дню. Считается, что
//    текущий день ещё не начался, и рабочие часы за него
//    должны учитываться.


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
