package test.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.useractivity.NewMembershipOrUpgrade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class NewMembershipOrUpgradeTest {

    main.com.ruleengine.implementation.useractivity.NewMembershipOrUpgrade newMembershipOrUpgrade = new NewMembershipOrUpgrade();

    @Test
    void executeUpgradeAndEmailOwner(){
        assertEquals(ActionStatus.SUCCESS,newMembershipOrUpgrade.executeAction());
    }
}
