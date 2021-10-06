package main.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.helper.UserActivityRepositoryMapping;
import main.com.ruleengine.interfaces.base.Action;
import main.com.ruleengine.interfaces.base.UserActivity;

import java.util.List;

import static main.com.ruleengine.config.UserActivityActionMapping.logger;
import static main.com.ruleengine.helper.UserActivityType.BOOK;

public class Book implements UserActivity {

    @Override
    public String getActivityName() {
        return BOOK.name();
    }

    @Override
    public ActionStatus executeAction() {
        List<ActionStatus> actionStatusList = null;
        try {
            List<Action> actionList = UserActivityRepositoryMapping.getActions(getActivityName());
            for (Action action : actionList) {
                actionStatusList.add(action.execute());
            }
            if (actionStatusList.contains(ActionStatus.FAILURE))
                return ActionStatus.FAILURE;
        } catch (Exception e) {
            logger.info("Failed while getting teh action for UserActivityType");
            e.printStackTrace();
        }
        return ActionStatus.SUCCESS;
    }
}
