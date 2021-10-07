package main.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.EmailService;

public class MembershipOrUpgrade implements EmailService {

    @Override
    public ActionStatus doSend() {
        //code to send email
        return ActionStatus.SUCCESS;
    }

    @Override
    public ActionStatus execute() {
        doSend();
        return ActionStatus.SUCCESS;
    }
}
