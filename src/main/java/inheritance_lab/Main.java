package inheritance_lab;

public class Main {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.setBark("xyz");
        System.out.println(sub.getBark());
    }
}