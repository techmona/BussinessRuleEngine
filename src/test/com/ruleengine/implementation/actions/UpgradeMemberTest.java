package test.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.actions.MembershipOrUpgrade;
import main.com.ruleengine.implementation.actions.UpgradeMember;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpgradeMemberTest {
    UpgradeMember upgradeMember = new  UpgradeMember();

    @Test
    void executeUpgrade() {
        assertEquals(ActionStatus.SUCCESS, upgradeMember.upgrade());
    }
}
