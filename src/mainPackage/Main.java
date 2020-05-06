// Объявление класса частью пакета
package mainPackage;
public class Main {
    // Конструктор класса отсутствует!!!
// Главный метод главного класса
public static void main(String[] args) throws Exception {

//Создание массива ссылок на продукты завтрака
Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        for(int itemIndex=0; itemIndex <args.length; itemIndex++) {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese")) {
                // У сыра дополнительных параметров нет
                breakfast[itemIndex] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                // У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemIndex] = new Apple(parts[1]);
            } else if (parts[0].equals("Tea")) {
                // tea has 1 parameter
                breakfast[itemIndex] = new Tea(parts[1]);
            }
               // ... Продолжается анализ других продуктов для завтрака
        }

        // Перебор всех элементов массива
    for (Food item : breakfast) {
        if (item == null) break;
        item.consume();
    }
    counts(breakfast);


    System.out.println("Всего хорошего!");
}


    static void counts(Food[] breakfast) {


        Cheese cheese = new Cheese();
        Apple apple = new Apple("большое");
        Tea tea = new Tea("Черный");

        int[] counts = new int[3];

        for (int itemIndex = 0; itemIndex < breakfast.length; itemIndex++) {
            if (breakfast[itemIndex] == null) break;
            {
                if (breakfast[itemIndex].equals(cheese)) {
                    counts[0]++;
                } else if (breakfast[itemIndex].equals(apple)) {
                    counts[1]++;
                } else if (breakfast[itemIndex].equals(tea)) {
                    counts[2]++;
                }
            }
        }

        System.out.println("  " + counts[0] + "  " + "Cheese");
        System.out.println("  " + counts[1] + "  " + "Apple");
        System.out.println("  " + counts[2] + "  " + "Tea");
    }
}