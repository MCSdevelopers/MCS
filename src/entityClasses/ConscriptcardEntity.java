package entityClasses;

import javax.persistence.*;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "conscriptcard", schema = "", catalog = "mydb")
public class ConscriptcardEntity {
    private int idconscriptCardId;
    private String name;
    private String surname;
    private String fathersName;
    private String phoneNumber;
    private String passportData;
    private String medicalCardId;



    @Id
    @Column(name = "idconscriptCardId")
    public int getIdconscriptCardId() {
        return idconscriptCardId;
    }

    public void setIdconscriptCardId(int idconscriptCardId) {
        this.idconscriptCardId = idconscriptCardId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "fathersName")
    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "passportData")
    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    @Basic
    @Column(name = "medicalCardId")
    public String getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(String medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConscriptcardEntity that = (ConscriptcardEntity) o;

        if (idconscriptCardId != that.idconscriptCardId) return false;
        if (fathersName != null ? !fathersName.equals(that.fathersName) : that.fathersName != null) return false;
        if (medicalCardId != null ? !medicalCardId.equals(that.medicalCardId) : that.medicalCardId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (passportData != null ? !passportData.equals(that.passportData) : that.passportData != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idconscriptCardId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (fathersName != null ? fathersName.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (passportData != null ? passportData.hashCode() : 0);
        result = 31 * result + (medicalCardId != null ? medicalCardId.hashCode() : 0);
        return result;
    }
}
