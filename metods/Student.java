package metods;



public class Student extends User implements Printer{
    private String group, name, second_name, father_name, phone;
    public Student(String name, String second_name, String father_name, String phone, String group) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.phone = phone;
        this.group = group;
    }

    public Student(String name, String second_name, String father_name, String group) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.group = group;
    }

    public Student(Student student) {}

    //-----------------------------
    @Override
    public void sayHello() {
        System.out.println("Привет, я ученик! И меня зовут - " + name);
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("*Студент" + "\n"
                + "Имя: " + name + "\n"
                + "Фамилия: " + second_name + "\n"
                + "Отчество: " + father_name + "\n"
                + "Телефон: " + phone + "\n"
                + "Группа: " + group
        );
    }

    //------------
    // Getters
    public String getGroup() {
        return group;
    }
}
