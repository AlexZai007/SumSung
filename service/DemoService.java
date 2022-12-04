package service;

import metods.Student;
import metods.Teacher;
import metods.University;

public class DemoService {
    public void demo() {

        //Задаем студентов
        Student student1 = new Student("Олег", "Олегович", "Алеговический", "+7(916)120-23-27", "Математики");
        Student student2 = new Student("Александр", "Зайцев", "Александрович", "+7(916)120-23-28", "ИТ");
        Student student3 = new Student("Марина", "Маркова", "Валерьевна", "+7(916)120-23-27", "Физики");

        //задаем учителей
        Teacher teacher1 = new Teacher("Степан", "Петушков", "Игоревич", "+7(999)999-99-01", new String[]{"Математика", "ИТ", "Химия"});
        Teacher teacher2 = new Teacher("Хорхе", "Хуакин", "Гонакалес Ушаков", "+7(999)999-99-01", new String[]{"Английский", "Физика", "ИТ"});
        Teacher teacher3 = new Teacher("Ирина", "Владимировна", "Сидорович", "+7(999)999-99-01", new String[]{"Высшая математика", "Биология", "История"});

        System.out.println();

        //инцилизируем!!!
        University university = new University(
                "МГСУ", "Россия, Москва Пушкина д29",  //задаем базу
                new Student[]{student1, student2, student3}, //инцилизируем учеников
                new Teacher[]{teacher1, teacher2, teacher3} //инцилизируем учителей
        );

        //Ввыводим информацию про новый университет
        university.printInfoToConsoleSuperKpacuBo();
    }
}