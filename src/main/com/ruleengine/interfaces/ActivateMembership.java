package main.com.ruleengine.interfaces;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.base.Action;

public interface ActivateMembership extends Action{

    public ActionStatus activate();
}
