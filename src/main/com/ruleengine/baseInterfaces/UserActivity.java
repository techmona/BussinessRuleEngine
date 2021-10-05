package main.com.ruleengine.baseInterfaces;

import main.com.ruleengine.helper.ActionStatus;

import java.util.List;

public interface UserActivity {
    static List<Action> listOfActions = null;

    default ActionStatus executeAction(){
        for (Action action:listOfActions) {
            action.execute();
        }
        return ActionStatus.SUCCESS;
    }
}
