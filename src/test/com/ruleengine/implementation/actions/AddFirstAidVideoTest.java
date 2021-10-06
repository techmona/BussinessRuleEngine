package test.com.ruleengine.implementation.actions;

import main.com.ruleengine.helper.ActionStatus;
import main.com.ruleengine.implementation.actions.AddFirstAidVideo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFirstAidVideoTest {
    AddFirstAidVideo addFirstAidVideo = new AddFirstAidVideo();

    @Test
    void executeAddFirstAidVideo() {

        assertEquals(ActionStatus.SUCCESS, addFirstAidVideo.addFirstAidVideo());
    }

    @Test
    void testExecute() {
        assertEquals(ActionStatus.SUCCESS, addFirstAidVideo.execute());
    }
}
