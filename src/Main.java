import main.com.ruleengine.config.UserActivityActionMapping;

public class Main {

    public static void main(String[] args) {
        //Register mappings on loading the application
        UserActivityActionMapping userActivityActionMapping = new UserActivityActionMapping();
        userActivityActionMapping.register();
    }
}
