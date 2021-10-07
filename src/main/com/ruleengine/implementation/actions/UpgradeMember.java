package main.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.UpgradeMembership;

public class UpgradeMember implements UpgradeMembership{

    @Override
    public ActionStatus upgrade() {
        //write code to upgrade membership
        return ActionStatus.SUCCESS;
    }

    @Override
    public ActionStatus execute() {
        upgrade();
        return ActionStatus.SUCCESS;
    }
}
