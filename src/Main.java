public class Main {
    public static void main(String[] args) {
        Linked list = new Linked();

        list.add("Valami");
        list.add("MegValami");
        list.add("EsMegValami");

        System.out.println(list);

        System.out.println(list.size());

        list.remove(0);

        System.out.println(list.size());
    }
}
