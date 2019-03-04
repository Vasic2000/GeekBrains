package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Team.Competitor;

import java.util.ArrayList;
import java.util.List;

public class Course extends Obstacle{
List<Obstacle> course = new ArrayList<>();
    public Course(Obstacle...obst) {
        for(Obstacle o : obst)
            course.add(o);
    }

    @Override
    public void doIt(Competitor competitor) {
        for(Obstacle o : course)
            o.doIt(competitor);
    }
}
