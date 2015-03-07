package DAO;

import logic.Specialist;

/**
 * Created by user on 06.03.2015.
 */
public class Factory {
    private static SpecialistDAO specialistDAO = null;
    private static ActionDAO actionDAO = null;
    private static DecisionDAO decisionDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public static SpecialistDAO getSpecialistDAO(){
        if (specialistDAO==null){
            specialistDAO = new SpecialistDAO();
        }
        return specialistDAO;
    }

    public static ActionDAO getActiontDAO(){
        if (actionDAO==null){
            actionDAO = new ActionDAO();
        }
        return actionDAO;
    }

    public static DecisionDAO getDecisionDAO(){
        if (decisionDAO==null){
            decisionDAO = new DecisionDAO();
        }
        return decisionDAO;
    }


}
