

public class Animals {


    //Задаем какие то переменные
    private String Nickname;
    private String Name;
    private String Type;


    //конструкторы
    public Animals(String Nickname, String Name, String Type) {
        this.Nickname = Nickname;
        this.Name = Name;
        this.Type = Type;
    }

    public Animals(Animals animals) {
        this.Nickname = GetNickname();
        this.Name = GetName();
        this.Type = GetType();
    }


    //Гетеры
    public String GetNickname() {
        return Nickname;
    }

    public String GetName() {
        return Name;
    }

    public String GetType() {
        return Type;
    }

    //Смена клички или влодельца (не ну все может быть)

    public void ChangeName(String name){
        this.Name = name;
    }


    //Заменяем ту стринг на красивск
    @Override
    public String toString() {

        String res = "Кличка животного : " + Nickname + "\n"
                + "Имя владельца : " + Name + "\n"
                + "Тип : " + Type + "\n";

        return res;
    }

}
