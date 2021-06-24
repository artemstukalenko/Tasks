package basic_java_homework;

public class Model {
    private String userGreeting = "";

    public void setUserGreeting(String userGreeting) {
        this.userGreeting += userGreeting + " ";
    }

    public String getUserGreeting() {
        return userGreeting.trim();
    }
}
