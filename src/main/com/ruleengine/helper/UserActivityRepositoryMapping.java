package main.com.ruleengine.helper;

import main.com.ruleengine.interfaces.base.Action;
import main.com.ruleengine.model.ActionMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public  class UserActivityRepositoryMapping {
   static List<ActionMapping> actionMappings = new ArrayList<>();

    public static boolean registerMapping(ActionMapping mapping )
    {
        actionMappings.add(mapping);
        return true;
    }
    public static List<Action> getActions(String userActivityName){
        List<Action> actionList = new ArrayList<>();
      List<ActionMapping> mapping =  actionMappings.stream().filter(u -> u.userActivityName.equals(userActivityName)).collect(Collectors.toList());
      for(ActionMapping obj : mapping){
          actionList.add(obj.actionName);
      }
        return actionList;
    }

}

