package main.com.ruleengine.interfaces.base;

import main.com.ruleengine.helper.ActionStatus;

import java.util.List;

public interface UserActivity {
    static List<Action> listOfActions = null;

    public String getActivityName();

    public ActionStatus executeAction();

}
