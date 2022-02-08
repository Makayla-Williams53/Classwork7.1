public class Messages
{
    public static void main(String[] args)
    {
        Thought thinking = new Thought();
        Advice speaking = new Advice();

        thinking.messages();

        speaking.messages(); // overriden method

        System.out.println("\nMakayla Williams");
        System.out.println("Classwork 7.1");
    }
}
