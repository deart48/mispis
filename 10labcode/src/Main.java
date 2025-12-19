import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setName("Воронежский Государственный Университет");
        university.setNumberOfEmployeers(350);

        faculty faculty = new faculty();
        faculty.setName("Факультет Компьютерных наук");

        dean dean = new dean();
        dean.setName("Крыловецкий Александр Абрамович");
        dean.setEmail("krilovetskiy@vsu.edu");
        dean.setSocialSecurityNumber("8-800-535-55-55");

        institute institute = new institute();
        institute.setName("Кафедра Информационных технологий");
        institute.setAddress("г. Ворнеж, Университетская площадь, д. 1");

        research research = new research();
        research.setName("Сирота");
        research.setEmail("sirota@vsu.edu");
        research.setSocialSecurityNumber("8-800-555-55-55");
        research.setResearchArea("Искусственный интеллект");

        course course = new course();
        course.setId("CS67");
        course.setName("Введение в Java");
        course.setWeeklyDuration(5);

        lecturer lecturer = new lecturer();
        lecturer.setName("Сирота");
        lecturer.setEmail("sirota@vsu.edu");
        lecturer.setSocialSecurityNumber("8-800-555-55-55");
        lecturer.setResearchArea("Искусственный интеллект");

        project project = new project();
        project.setName("Разработка системы управления студентами(чипирование)");
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = formatter.parse("05.10.2023");
            project.setStartDate(date);
            date = formatter.parse("05.12.2023");
            project.setEndDate(date);
        } catch (ParseException e) {
            e.printStackTrace(); // Обработка ошибки, если формат строки неверный
        }


        Participation participation = new Participation();
        participation.setHours(20);

        System.out.println("Университет: " + university.getName());
        System.out.println("Число сотрудников: " + university.getNumberOfEmployeers());
        System.out.println("Факультет: " + faculty.getName());
        System.out.println("Декан: " + dean.getName());
        System.out.println("Кафедра: " + institute.getName());
        System.out.println("Научный сотрудник: " + research.getName());
        System.out.println("Курс: " + course.getName());
        System.out.println("Преподаватель: " + lecturer.getName());
        System.out.println("Проект: " + project.getName());
        System.out.println("Участие: " + participation.getHours() + " часов.");
    }
}
