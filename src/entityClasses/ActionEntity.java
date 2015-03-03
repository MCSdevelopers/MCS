package entityClasses;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "action", schema = "", catalog = "mydb")
public class ActionEntity {
    private int idAction;
    private Date data;
    private Time time;
    private String placeItteract;



    @Id
    @Column(name = "idAction")
    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    @Basic
    @Column(name = "Data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "Time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Basic
    @Column(name = "placeItteract")
    public String getPlaceItteract() {
        return placeItteract;
    }

    public void setPlaceItteract(String placeItteract) {
        this.placeItteract = placeItteract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActionEntity that = (ActionEntity) o;

        if (idAction != that.idAction) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (placeItteract != null ? !placeItteract.equals(that.placeItteract) : that.placeItteract != null)
            return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAction;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (placeItteract != null ? placeItteract.hashCode() : 0);
        return result;
    }
}
