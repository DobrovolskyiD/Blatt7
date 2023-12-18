public class ArrayStackTest {
    public static void main(String[] args) {
        // Testen mit Integer-Elementen
        Stack<Integer> intStack = new ArrayStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        intStack.push(4);
        intStack.push(5);

        System.out.println("Top: " + intStack.top());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.size());

        // Testen mit String-Elementen
        Stack<String> stringStack = new ArrayStack<>();
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");
        stringStack.push("E");

        System.out.println("Top: " + stringStack.top());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.size());
    }
}

