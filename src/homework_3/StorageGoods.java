package homework_3;

import java.util.*;
import java.util.stream.Collectors;


public class StorageGoods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> goods = new ArrayList<>(15);


        goods.add("Чебурашка");
        goods.add("Матрешка");
        goods.add("Балалайка");
        goods.add("Водка");
        goods.add("Самурай");
        goods.add("Сакура");
        goods.add("Удон");


        System.out.println("Привет! Ты находишься на складе" + "\n");
        System.out.println("Команды для работы со складом выглядят так:" + "\n"
                + "Если ты хочешь увидеть наименования товаров, которые лежат на складе, введи команду view" + "\n"
                + "Если ты хочешь добавить товар на склад, введи команду add" + "\n"
                + "Если ты хочешь удалить товар со склада, введи команду remove" + "\n"
                + "Если ты хочешь проверить наличие элемента на складе, введи команду contains" + "\n"
                + "Если ты хочешь узнать сколько всего единиц товара лежит на складе, введи команду size" + "\n"
                + "Если ты хочешь узнать количество товара на складе в виде 'товар-количество', введи команду count" + "\n"
                + "Если ты хочешь закрыть программу, введи команду exit");



        while(true) {
            String method = scan.nextLine();


            switch (method) {
                case "view" -> System.out.println("Cейчас на складе лежат эти товары " + goods);
                case "add" -> {
                    System.out.println("Введи наименование товара, который ты хочешь добавить: ");
                    goods.add(scan.nextLine());
                    System.out.println("Cейчас на складе лежат эти товары " + goods);
                }
                case "remove" -> {
                    System.out.println("Cейчас на складе лежат эти товары " + goods);
                    System.out.println("Введи наименование товара, который ты хочешь удалить:");
                    goods.remove(scan.nextLine());
                    System.out.println("А вот сейчас на складе лежат эти товары " + goods);
                }
                case "contains" -> {
                    System.out.println("Введи наименование товара, наличие которого ты хочешь проверить:");
                    if (goods.contains(scan.nextLine()) == goods.equals(goods)) {
                        System.out.println("На складе это есть");
                    } else {
                        System.out.println("На складе этого нет");
                    }
                }
                case "size" -> System.out.println("На складе всего " + goods.size() + " единиц товара");

                case "count" -> { Map<Object, Long> couterMap = goods.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting()));
                    System.out.println(couterMap);}

                default -> System.out.println("Неверная команда, попробуй еще");
            }

            System.out.println("Еще что-нибудь?");


            if (method.equals("exit")) {
                System.out.println("Выход из программы");
                break;
            }


        }

    }
}

