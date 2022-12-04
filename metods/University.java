package metods;
import javax.sound.midi.Soundbank;

public class University implements Printer{
    private String address;
    private String name;
    private Student[] students;
    private Teacher[] teachers;

    public University(String name, String address, Student[] students, Teacher[] teachers) {
        this.name = name;
        this.address = address;
        this.students = students;
        this.teachers = teachers;
    }
    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("---> Университет <---" + "\n"
                + "Наименование: " + name + "\n"
                + "Фактический адресс: " + address
        );
        System.out.println("\n" + "---> Ученики <---");
        for (int i = 0; i < students.length; i++) {
            students[i].printInfoToConsoleSuperKpacuBo();
            System.out.println();
        }

        System.out.println("---> Учителя <---");
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].printInfoToConsoleSuperKpacuBo();
            System.out.println();
        }
    }

    //--------------
    // Getters (получатели информации)
    public String getAddress() {return address;}
    public String getName() {return name;}
    public Student[] getStudents() {return students;}
    public Teacher[] getTeachers() {return teachers;}
}