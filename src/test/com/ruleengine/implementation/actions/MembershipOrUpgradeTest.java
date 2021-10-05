package test.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.actions.GeneratePaymentSlip;
import main.com.ruleengine.implementation.actions.MembershipOrUpgrade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class MembershipOrUpgradeTest {
    MembershipOrUpgrade membershipOrUpgrade = new  MembershipOrUpgrade();

    @Test
    void executeSendEmail() {
        assertEquals(ActionStatus.SUCCESS, membershipOrUpgrade.doSend());
    }
}
