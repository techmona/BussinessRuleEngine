package main.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.helper.UserActivityRepositoryMapping;
import main.com.ruleengine.helper.UserActivityType;
import main.com.ruleengine.interfaces.base.Action;
import main.com.ruleengine.interfaces.base.UserActivity;

import java.util.List;

public class UpgradeMembership implements UserActivity {

    @Override
    public String getActivityName() {

        return UserActivityType.UPGRADEMEMBERSHIP.name();
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
