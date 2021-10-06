package main.com.ruleengine.interfaces;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.base.Action;

public interface EmailService extends Action {
    public ActionStatus doSend();
}
