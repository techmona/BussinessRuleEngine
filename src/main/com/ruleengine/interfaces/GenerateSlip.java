package main.com.ruleengine.interfaces;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.base.Action;

public interface GenerateSlip extends Action {

    public ActionStatus generateSlip();
}
