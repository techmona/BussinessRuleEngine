package main.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.helper.UserActivityRepositoryMapping;
import main.com.ruleengine.interfaces.base.Action;
import main.com.ruleengine.interfaces.base.UserActivity;

import java.util.List;

public class SkiLearningVideo implements UserActivity {

    @Override
    public String getActivityName() {
        return "SkiLearning";
    }

    @Override
    public ActionStatus executeAction() {
        List<ActionStatus> actionStatusList = null;
        List<Action> actionList = UserActivityRepositoryMapping.getActions(getActivityName());
        for (Action action : actionList) {
            actionStatusList.add(action.execute());
        }
        if (actionStatusList.contains(ActionStatus.FAILURE))
            return ActionStatus.FAILURE;

        return ActionStatus.SUCCESS;
    }
}
