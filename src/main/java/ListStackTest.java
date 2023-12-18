public class ListStackTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new ListStack<>();
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");

        for (String element : stringStack) {
            System.out.println(element); // Gibt die Elemente in umgekehrter Reihenfolge aus
        }
    }
}

