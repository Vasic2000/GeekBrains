package Lesson_1.Marathon.Team;

import java.util.ArrayList;
import java.util.List;

public class Team implements Competitor {
    List<Competitor> team = new ArrayList<>();

    public Team(Competitor...comp) {
        for(Competitor co : comp)
            team.add(co);
    }

    // Новый метод
    public void showResults() {
        for(Competitor co : team)
            co.info();
    }

    @Override
    public void run(int dist) {
        for(Competitor co : team)
            co.run(dist);
    }

    @Override
    public void swim(int dist) {
        for(Competitor co : team)
            co.swim(dist);
    }

    @Override
    public void jump(int height) {
        for(Competitor co : team)
            co.jump(height);
    }

//    Заглушка. Требуется, посколку унаследован от интерфейса Competitor
//    Не используется. Можно сделать проверку дошла ли вся команда?
    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void info() {
        for(Competitor co : team)
            co.info();
    }
}
