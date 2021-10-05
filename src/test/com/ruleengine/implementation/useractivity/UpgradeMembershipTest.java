package test.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.useractivity.UpgradeMembership;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpgradeMembershipTest {

    UpgradeMembership upgradeMembership = new UpgradeMembership();
    @Test
    void executePaymentActionForUpgradeMembership(){
       assertEquals(ActionStatus.SUCCESS,upgradeMembership.executeAction());
    }

}
