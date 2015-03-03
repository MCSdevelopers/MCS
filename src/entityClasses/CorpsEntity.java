package entityClasses;

import javax.persistence.*;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "corps", schema = "", catalog = "mydb")
public class CorpsEntity {
    private int corpsId;
    private String numberOfOutfit;
    private String name;

    @Id
    @Column(name = "corpsID")
    public int getCorpsId() {
        return corpsId;
    }

    public void setCorpsId(int corpsId) {
        this.corpsId = corpsId;
    }

    @Basic
    @Column(name = "NumberOfOutfit")
    public String getNumberOfOutfit() {
        return numberOfOutfit;
    }

    public void setNumberOfOutfit(String numberOfOutfit) {
        this.numberOfOutfit = numberOfOutfit;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CorpsEntity that = (CorpsEntity) o;

        if (corpsId != that.corpsId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (numberOfOutfit != null ? !numberOfOutfit.equals(that.numberOfOutfit) : that.numberOfOutfit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = corpsId;
        result = 31 * result + (numberOfOutfit != null ? numberOfOutfit.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
