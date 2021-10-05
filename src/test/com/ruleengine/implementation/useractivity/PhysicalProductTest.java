package test.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.useractivity.PhysicalProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class PhysicalProductTest {
    PhysicalProduct physicalProduct = new PhysicalProduct();

    @Test
    void executePaymentSlipForPhysicalProduct(){
        assertEquals(ActionStatus.SUCCESS,physicalProduct.executeAction());
    }
}
