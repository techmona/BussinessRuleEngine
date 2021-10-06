package main.com.ruleengine.interfaces;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.base.Action;

public interface UpgradeMembership extends Action {
    public ActionStatus upgrade();
}
