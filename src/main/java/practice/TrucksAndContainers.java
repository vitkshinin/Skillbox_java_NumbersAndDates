package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    private static final int BOX_IN_CONTAINER = 27;
    private static final int CONTAINER_IN_TRUCK = 12;

    public static void main(String[] args) {

        int truck = 0;
        int container = 0;

        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

        for(int i = 0; i < boxes;) {
            if(i % (BOX_IN_CONTAINER * CONTAINER_IN_TRUCK) == 0) {
                truck++;
                System.out.println("Грузовик: " + truck);
            }
                if(i % BOX_IN_CONTAINER == 0) {
                    container ++;
                    System.out.println("\t" + "Контейнер: " + container);
                }
                i++;
                System.out.println("\t\t" + "Ящик: " + i);
        }
        System.out.println("Необходимо:" + "\n" + "грузовиков - " + truck + " шт." + "\n" + "контейнеров - " + container + " шт.");
    }

}
