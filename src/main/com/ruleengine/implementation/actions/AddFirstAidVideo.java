package main.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.interfaces.VideoLearningSki;

public class AddFirstAidVideo implements VideoLearningSki{
    @Override
    public ActionStatus addFirstAidVideo() {
        //Write code to add First aid video
        return ActionStatus.SUCCESS;
    }

    @Override
    public ActionStatus execute() {
        addFirstAidVideo();
        return ActionStatus.SUCCESS;
    }
}
