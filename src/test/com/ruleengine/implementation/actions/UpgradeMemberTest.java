package test.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.actions.UpgradeMember;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class UpgradeMemberTest {
    UpgradeMember upgradeMember = new  UpgradeMember();

    @Test
    void executeUpgrade() {
        assertEquals(ActionStatus.SUCCESS, upgradeMember.upgrade());
    }


    @Test
    void testExecute(){
        assertEquals(ActionStatus.SUCCESS, upgradeMember.execute());
    }
}
