package mainPackage;

public class Tea extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String color;

    public Tea(String color) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Чай");
        this.color = color;
    }
    // Переопределить способ употребления чая
    public void consume() {
        System.out.println(this + " выпит");
    }
    //Геттер для доступа к полю данных ЦВЕТ
    public String getColor() {
        return color;
    }
    // Сеттер для изменения поля данных ЦВЕТ
    public void setColor(String color) {
        this.color = color;
    }
    // Переопределенная версия метода equals(), которая при сравнении
    // учитывает не только поле name (Шаг 1), но и проверяет совместимость
    // типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (!super.equals(arg0)) return false; // Шаг 1
        if (!(arg0 instanceof Tea)) return false;  // Шаг 2
        return color.equals(((Tea)arg0).color); // Шаг 3
    }
    // Переопределенная версия метода toString(), возвращающая не только
    // название продукта, но и его размер
    public String toString() {
        return super.toString() + " цвета '" + color.toUpperCase() + "'";
    }

}
