package main.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.helper.UserActivityRepositoryMapping;
import main.com.ruleengine.helper.UserActivityType;
import main.com.ruleengine.interfaces.base.Action;
import main.com.ruleengine.interfaces.base.UserActivity;

import java.util.List;

import static main.com.ruleengine.config.UserActivityActionMapping.logger;

public class NewMembershipOrUpgrade implements UserActivity {

    @Override
    public String getActivityName() {
        return UserActivityType.NEWMEMBERSHIPORUPGRADE.name();
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
        }catch(Exception e){
            logger.info("Failed while getting the action for UserActivityType");
            e.printStackTrace();
        }
        return ActionStatus.SUCCESS;
    }
}

