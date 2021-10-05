package test.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.useractivity.UpgradeMembership;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;


import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class UpgradeMembershipTest {

    UpgradeMembership upgradeMembership = new UpgradeMembership();

    @Test
    void executePaymentActionForUpgradeMembership(){
       assertEquals(ActionStatus.SUCCESS,upgradeMembership.executeAction());
    }

}
