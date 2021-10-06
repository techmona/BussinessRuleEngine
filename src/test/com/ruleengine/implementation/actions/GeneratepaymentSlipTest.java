package test.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.actions.GenerateDuplicatePaymentSlip;
import main.com.ruleengine.implementation.actions.GeneratePaymentSlip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class GeneratepaymentSlipTest {
    GeneratePaymentSlip generatepaymentSlip = new  GeneratePaymentSlip();

    @Test
    void executePaymentSlip()
    {
        assertEquals(ActionStatus.SUCCESS, generatepaymentSlip.generateSlip());
    }

    @Test
    void testExecute(){
        assertEquals(ActionStatus.SUCCESS, generatepaymentSlip.execute());
    }
}
