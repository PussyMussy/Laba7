package Example4;

public class Program {
    public static class Alpha
    {
        // Открытое поле:
        public static char alpha;
        // Виртуальный метод:
        public static void show()
    {
        System.out.println("Класс Alpha: {0}"+ alpha);
    }
        // Конструктор с одним аргументом:
        public Alpha(char a)
        {
            alpha = a;
        }
        // Конструктор создания копии:
        public Alpha(Alpha obj)
        {
            alpha = obj.alpha;
        }
    }
    // Производный класс от класса Alpha:
    static class Bravo extends Alpha
    {
        // Открытое поле:
        public static String bravo;

        public Bravo(char a) {
            super(a);
        }
        // Переопределение виртуального метода:

         public static void show()
        {
            System.out.println("Класс Bravo: {0} и {1}"+ alpha+ bravo);
        }
        // Конструктор с двумя аргументами:
        public Bravo(char a, String b) {
            super(a);
            bravo =b;
        }
        // Конструктор создания копии:
        public Bravo(Bravo obj)
        {
            super(obj);
            bravo = obj.bravo;
        }
    }
    static class Charlie extends Bravo
    {
        // Открытое поле:
        public static int charlie;
        // Переопределение виртуального метода:
        public static void show()
        {
            System.out.println("Класс Charlie: {0}, {1} и {2}"+ alpha+ bravo+ charlie);
        }
        // Конструктор с тремя аргументами:
        public Charlie(char a, String b, int c)
        {
            super(a, b);
            charlie = c;
        }
        // Конструктор создания копии:
        public Charlie(Charlie obj)
        {
            super(obj);
            charlie = obj.charlie;
        }

}}
