package entityClasses;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by user on 02.03.2015.
 */
@Entity
@Table(name = "innerdocument", schema = "", catalog = "mydb")
public class InnerdocumentEntity {
    private int idInnerDocument;
    private String name;
    private String url;
    private Date date;

    @Id
    @Column(name = "idInnerDocument")
    public int getIdInnerDocument() {
        return idInnerDocument;
    }

    public void setIdInnerDocument(int idInnerDocument) {
        this.idInnerDocument = idInnerDocument;
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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnerdocumentEntity that = (InnerdocumentEntity) o;

        if (idInnerDocument != that.idInnerDocument) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idInnerDocument;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
