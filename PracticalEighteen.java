public class PracticalEighteen {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append strings to the StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World!");

        // Print the StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Insert a string at a specific position
        stringBuffer.insert(5, " Java");

        // Print the modified StringBuffer
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // Reverse the StringBuffer
        stringBuffer.reverse();

        // Print the reversed StringBuffer
        System.out.println("Reversed StringBuffer: " + stringBuffer);

        // Delete a portion of the StringBuffer
        stringBuffer.delete(0, 6);

        // Print the modified StringBuffer
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // Replace a portion of the StringBuffer
        stringBuffer.replace(0, 5, "Hi");

        // Print the modified StringBuffer
        System.out.println("Modified StringBuffer: " + stringBuffer);
    }
}
