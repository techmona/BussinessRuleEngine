package test.com.ruleengine.implementation.useractivity;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.useractivity.Book;
import main.com.ruleengine.implementation.useractivity.Membership;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class BookTest {
    Book book   = new Book();

    @Test
    void executeCreateDuplicateBookingSlip(){
        assertEquals(ActionStatus.SUCCESS,book.executeAction());
    }
}
