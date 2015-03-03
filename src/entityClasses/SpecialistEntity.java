package entityClasses;

import javax.persistence.*;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "specialist", schema = "", catalog = "mydb")
public class SpecialistEntity {
    private int idSpecialist;
    private String name;
    private String surname;
    private String fathersName;
    private String position;
    private String rank;

    @Id
    @Column(name = "idSpecialist")
    public int getIdSpecialist() {
        return idSpecialist;
    }

    public void setIdSpecialist(int idSpecialist) {
        this.idSpecialist = idSpecialist;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "FathersName")
    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "rank")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialistEntity that = (SpecialistEntity) o;

        if (idSpecialist != that.idSpecialist) return false;
        if (fathersName != null ? !fathersName.equals(that.fathersName) : that.fathersName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (rank != null ? !rank.equals(that.rank) : that.rank != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSpecialist;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (fathersName != null ? fathersName.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        return result;
    }
}
