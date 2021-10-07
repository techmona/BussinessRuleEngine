package main.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.GenerateSlip;

public class GeneratePaymentSlip implements GenerateSlip {
    @Override
    public ActionStatus generateSlip()
    {//write code to generate Payment slip
        return ActionStatus.SUCCESS;
    }

    @Override
    public ActionStatus execute() {
        generateSlip();
        return ActionStatus.SUCCESS;
    }
}
