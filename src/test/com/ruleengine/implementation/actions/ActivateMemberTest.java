package test.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.actions.ActivateMember;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ActivateMemberTest {
    ActivateMember activateMember = new ActivateMember();

    @Test
    void executeActivateMember() {

        assertEquals(ActionStatus.SUCCESS, activateMember.activate());
    }

    @Test
    void testExecute(){
        assertEquals(ActionStatus.SUCCESS, activateMember.execute());
    }
}
