public class Main {
    public static void main(String[] args) {

        Animals dog = new Animals(
                "Тоби",
                "Владислав",
                "Собакен"
        );

        Animals dog_2 = new Animals(dog);


        System.out.println(dog);
        dog.ChangeName("Глеб");
        System.out.println(dog);




    }
}