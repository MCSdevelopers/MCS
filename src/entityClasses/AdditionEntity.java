package entityClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "addition", schema = "", catalog = "mydb")
public class AdditionEntity {
    private int additionId;

    @Id
    @Column(name = "additionID")
    public int getAdditionId() {
        return additionId;
    }

    public void setAdditionId(int additionId) {
        this.additionId = additionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdditionEntity that = (AdditionEntity) o;

        if (additionId != that.additionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return additionId;
    }
}
