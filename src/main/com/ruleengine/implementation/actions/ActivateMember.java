package main.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.ActivateMembership;

public class ActivateMember implements ActivateMembership {
    @Override
    public ActionStatus activate() {
        //write code to activate membership
        return ActionStatus.SUCCESS;
    }

    @Override
    public ActionStatus execute() {
        activate();
        return ActionStatus.SUCCESS;
    }
}
