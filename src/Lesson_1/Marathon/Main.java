package Lesson_1.Marathon;

import Lesson_1.Marathon.Obstacles.*;
import Lesson_1.Marathon.Team.Cat;
import Lesson_1.Marathon.Team.Dog;
import Lesson_1.Marathon.Team.Human;
import Lesson_1.Marathon.Team.Team;

public class Main {
    public static void main(String[] args) {
//        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
//        }

        Course c = new Course(new Cross(80), new Wall(2), new Water(10), new Wall(1), new Cross(120)); // Создаем полосу препятствий
        Team team = new Team(new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"));                                    // Создаем команду
        c.doIt(team);                                                                                                                      // Просим команду пройти полосу
        team.showResults();                                                                                                                // Показываем результаты
    }
}