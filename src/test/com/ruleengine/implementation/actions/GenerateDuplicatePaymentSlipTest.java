package test.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.actions.GenerateDuplicatePaymentSlip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class GenerateDuplicatePaymentSlipTest {
    GenerateDuplicatePaymentSlip generateDuplicatePaymentSlip = new GenerateDuplicatePaymentSlip();

    @Test
    void executeduplicatePaymentSlip() {
        assertEquals(ActionStatus.SUCCESS, generateDuplicatePaymentSlip.generateSlip());
    }
}
