package Example4;

import static Example4.Program.*;
public class Main {
    public static void main(String[] args) {
        Alpha objA = new Alpha('A');
        Alpha objA_copy = objA;
        // Проверка значения поля:
        objA.show();
        System.out.println("Работает конструктор копирования:");
        objA_copy.show();
        System.out.println();
        // Создание объекта класса Bravo:
        Bravo objB = new Bravo('A', "BCDE");
        // Объектной переменной базового класса присваивается
        // ссылка на объект производного класса:
        objA = objB;
        // Проверка значений полей:
        objA.show();
        objB.show();
        Bravo objB_copy = objB;
        System.out.println("Работает конструктор копирования:");
        objB_copy.show();
        System.out.println();
        // Создание объекта класса Charlie:
        Charlie objC = new Charlie('F', "GHIJ", 10);
        // Объектной переменной базового класса присваивается
        // ссылка на объект производного класса:
        objA = objC;
        objB = objC;
        // Проверка значений полей:
        objA.show();
        objB.show();
        objC.show();
        Charlie objC_copy = objC;
        System.out.println("Работает конструктор копирования:");
        objC_copy.show();
    }
}
