package metods;

public class Teacher extends User implements Printer{
    private String[] subjects;
    private String name, second_name, father_name, phone;

    public Teacher(String name, String second_name, String father_name, String phone, String[] subjects) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.phone = phone;
        this.subjects = subjects;
    }

    public Teacher(String name, String second_name, String father_name, String[] subjects) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.subjects = subjects;
    }

    public Teacher(Teacher teacher) {
        super();
    }

    //------------------
    // Methods
    public void sayHello() {
        System.out.println("Здравствуйте! Я преподаватель, мое имя " + name);
    }

    //метод для вывода информации об учители
    @Override
    public void printInfoToConsoleSuperKpacuBo() {

        System.out.print("*Учитель " + "\n"
                + "Имя: " + name + "\n"
                + "Фамилия: " + second_name + "\n"
                + "Отчество: " + father_name + "\n"
                + "Телефон: " + phone + "\n"
                + "Предмет: "
        );
        //можно было использовать STR и конконстинацию но я ленивый
        for (int i = 0; i < subjects.length; i++) {
            if (i + 1 < subjects.length) System.out.print(subjects[i] + ", ");
            else System.out.println(subjects[i] + ".");

        }

    }

    //-----------------
    // Getter (получатель инфы)
    public String[] getSubjects() {
        return subjects;
    }
}