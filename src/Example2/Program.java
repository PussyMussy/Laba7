package Example2;

public class Program {

    public static class SuperClass {
        private String str;

        SuperClass(String strEx) {
            str = strEx;
        }

        public int getStr1() {
            return str.length();
        }

        public void setStr(String str) {
            this.str = str;
        }

    }

    public static class SubClass extends SuperClass {
        int num;

        SubClass(String strEX, int num) {
            super(strEX);
            this.num = num;
        }

        public void setStr() {
        }

        public void setStr(String str) {
            super.setStr(str);
        }

        public void setStr(int num) {
            this.num = num;
        }

        public void setStr(String str, int num) {
            super.setStr(str);
            this.num = num;
        }

    }
}