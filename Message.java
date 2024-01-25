public class Message {
    private String message;
    public static void main(String[] args) {
        Message msg= new Message("Hello, how are you...!");
        System.out.println(msg.getMessage());
        msg.setMessage("i am good ... what about you...?");
        System.out.println(msg.getMessage());

    }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
