package entityClasses;

import javax.persistence.*;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "medicalunit", schema = "", catalog = "mydb")
public class MedicalunitEntity {
    private int idmedicalUnit;
    private String comment;
    private String expert;

    @Id
    @Column(name = "idmedicalUnit")
    public int getIdmedicalUnit() {
        return idmedicalUnit;
    }

    public void setIdmedicalUnit(int idmedicalUnit) {
        this.idmedicalUnit = idmedicalUnit;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "expert")
    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicalunitEntity that = (MedicalunitEntity) o;

        if (idmedicalUnit != that.idmedicalUnit) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (expert != null ? !expert.equals(that.expert) : that.expert != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmedicalUnit;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (expert != null ? expert.hashCode() : 0);
        return result;
    }
}
