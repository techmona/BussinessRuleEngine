package test.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.useractivity.Membership;
import main.com.ruleengine.implementation.useractivity.PhysicalProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class MembershipTest {
    Membership membership = new Membership();

    @Test
    void executeActivateMembership(){
        assertEquals(ActionStatus.SUCCESS,membership.executeAction());
    }
}
