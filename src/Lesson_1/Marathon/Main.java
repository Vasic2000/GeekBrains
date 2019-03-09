package Lesson_1.Marathon;

import Lesson_1.Marathon.Obstacles.*;
import Lesson_1.Marathon.Team.Cat;
import Lesson_1.Marathon.Team.Dog;
import Lesson_1.Marathon.Team.Human;
import Lesson_1.Marathon.Team.Team;

public class Main {
    public static void main(String[] args) {
//
//        Урок 1. Объектно-ориентированное программирование Java
//        1. Разобраться с имеющимся кодом;
//        2. Добавить класс Team, который будет содержать название команды, массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ), метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.
//        3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;


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