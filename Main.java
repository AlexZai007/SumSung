import service.DemoService;

public class Main {
    public static void main(String[] args) {
        //инцилизируем демо университет
        DemoService demoService = new DemoService();
        demoService.demo();

        //Посхалочка от гения
        System.out.printf("Вам представлена demo программы 'Университет 2000', что бы получить полный доступ вам нужно прислать фотографию кота в банке нашему менеджеру. Спасибо, что используете только лучший софт. Ваш любимый DiaSOFT");
    }
}