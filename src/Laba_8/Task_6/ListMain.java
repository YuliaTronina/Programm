package Laba_8.Task_6;


public class ListMain {
    public static void main(String[] args) {
        ListMethodsCycle.createHead(3);

        ListMethodsCycle.createTail(5);

        System.out.println("Вывод списка в строку - " + ListMethodsCycle.toString(ListMethodsCycle.createHead(5)));

        System.out.println("Начальный список - " + ListMethodsCycle.toString(ListMethodsCycle.createTail(5)));
        System.out.println("Добавили значение в начало списка - "
                + ListMethodsCycle.toString(ListMethodsCycle.AddFirst(ListMethodsCycle.createTail(5),9)));

        System.out.println("Добавили значение в конец списка - "
                + ListMethodsCycle.toString(ListMethodsCycle.AddLast(ListMethodsCycle.createTail(5),13)));

        System.out.println("Добавили значение в произвольное место списка - "
                + ListMethodsCycle.toString(ListMethodsCycle.Insert(ListMethodsCycle.createTail(5),5, 124)));

        System.out.println("Удалили первый элемент списка - "
                + ListMethodsCycle.toString(ListMethodsCycle.RemoveFirst(ListMethodsCycle.createTail(5))));

        System.out.println("Удалили последний элемент списка - "
                + ListMethodsCycle.toString(ListMethodsCycle.RemoveLast(ListMethodsCycle.createTail(5))));

        System.out.println("Удалили произвольный элемент списка - "
                + ListMethodsCycle.toString(ListMethodsCycle.Remove(ListMethodsCycle.createTail(5), 10)));


        System.out.println("Удалили произвольный элемент списка - "
                        + ListMethodsCycle.toString(ListMethodsCycle.Remove(ListMethodsCycle.createTail(5), 3)));

}

}


