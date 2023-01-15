package Example5;

public class Main {
    public static void main(String[] args) {
        Superclass sup = new Superclass("Суперкласс");
        sup.logSelf();
        Podclass sub1 = new Podclass("Подкласс", 1);
        sub1.logSelf();
        Podclass2 sub2 = new Podclass2("Подкласс2", '2');
        sub2.logSelf();
    }}
