import main.com.ruleengine.config.UserActivityActionMapping;

public class BusinessRuleEngineStarter {

    public static void main(String[] args) {
        //Register mappings on loading the application
        UserActivityActionMapping userActivityActionMapping = new UserActivityActionMapping();
        userActivityActionMapping.register();
    }
}
