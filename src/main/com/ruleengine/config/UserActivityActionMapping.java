package main.com.ruleengine.config;

import main.com.ruleengine.helper.UserActivityRepositoryMapping;
import main.com.ruleengine.helper.UserActivityType;
import main.com.ruleengine.implementation.actions.*;
import main.com.ruleengine.model.ActionMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserActivityActionMapping {

    public static Logger logger = Logger.getLogger(UserActivityActionMapping.class.getName());
    public void register(){
        List<ActionMapping> actionMappings = new ArrayList<>();
        actionMappings.add(new ActionMapping(){{userActivityName  = UserActivityType.BOOK.name(); actionName = new GenerateDuplicatePaymentSlip();}});
        actionMappings.add(new ActionMapping(){{userActivityName  =UserActivityType.MEMBERSHIP.name(); actionName = new ActivateMember();}});
        actionMappings.add(new ActionMapping(){{userActivityName  =UserActivityType.NEWMEMBERSHIPORUPGRADE.name(); actionName = new MembershipOrUpgrade();}});
        actionMappings.add(new ActionMapping(){{userActivityName  =UserActivityType.PHYSICALPRODUCT.name(); actionName = new GeneratePaymentSlip();}});
        actionMappings.add(new ActionMapping(){{userActivityName  =UserActivityType.SKILEARNING.name(); actionName = new AddFirstAidVideo();}});
        actionMappings.add(new ActionMapping(){{userActivityName  =UserActivityType.UPGRADEMEMBERSHIP.name(); actionName = new UpgradeMember();}});
        logger.info("Added all  mapping for userActivityType and Action");

        for(ActionMapping mapping : actionMappings){
            UserActivityRepositoryMapping.registerMapping(mapping);
        }
    }
}
