package object.oriented.programming;

class Outer {
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    class Inner {
        int num;
        Inner(int num) {
            this.num = num;
        }
        void show() {
            System.out.println("In Inner class num: " + num);
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

    void show() {
        System.out.println("In Outer class num: " + num);
    }
    Outer(int num) {
        this.num = num;
    }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer(1);
        outer.show();
        Outer.Inner inner = outer.new Inner(2);
        inner.show();
    }
}
