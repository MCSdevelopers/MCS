package DAO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 06.03.2015.
 */
public interface GeneralDAO <T>{
    public T getObjectByID (int id) throws SQLException;
    public List<T> getAll();

}
