package entityClasses;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "decision", schema = "", catalog = "mydb")
public class DecisionEntity {
    private int idDecision;
    private Date date;
    private String comment;

    @Id
    @Column(name = "idDecision")
    public int getIdDecision() {
        return idDecision;
    }

    public void setIdDecision(int idDecision) {
        this.idDecision = idDecision;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DecisionEntity that = (DecisionEntity) o;

        if (idDecision != that.idDecision) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDecision;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
