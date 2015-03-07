package DAO;

import logic.Specialist;

/**
 * Created by user on 06.03.2015.
 */
public class Factory {
    private static SpecialistDAO specialistDAO = null;
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

}
