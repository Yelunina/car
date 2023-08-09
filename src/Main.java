
public class Main {
    /*#1 Создать класс Car со следующими полями (String brand, String color, String licensePlate,
     MyDate registrationDate, Engine engine}
Оьратите внимание, поля registrationDate и engine - это тоже объект.
Engine - содержит информация о мощности двигателя и о типе (бензин, дизель, электро).
Реализуйте метод toString в каждом классе.
Реализуйте метод конструктор в каждом классе.
Создайте два объекта автомобиля.
 */
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "silver", "BB48720", new MyDate(18, 11, 2023), new Engine("334 HP", "Disel"));
        Car car2 = new Car("Tesla", "black", "BB777", new MyDate(18, 10, 2023), new Engine("1020 HP", "Electro"));
        System.out.println(car1);
        System.out.println(car2);

    }
}
