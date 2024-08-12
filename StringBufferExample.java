package classes;

public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(5, 6, "!");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Capacity
        System.out.println("Capacity: " + sb.capacity());

        // Length
        System.out.println("Length: " + sb.length());
    }
}
