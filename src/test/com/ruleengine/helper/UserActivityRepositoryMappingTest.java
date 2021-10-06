package test.com.ruleengine.helper;

import main.com.ruleengine.helper.UserActivityRepositoryMapping;
import main.com.ruleengine.implementation.actions.ActivateMember;
import main.com.ruleengine.model.ActionMapping;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class UserActivityRepositoryMappingTest {


    @Test
    void testRegisterMappings(){
        ActionMapping mapping = new ActionMapping();
        mapping.actionName =new ActivateMember();
        assertTrue(UserActivityRepositoryMapping.registerMapping(mapping));
    }
}
