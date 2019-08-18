package hibernate.example.fetchmode_subselect;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "user")
public class FetchModeSubselectUser {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @OneToMany
    @JoinColumn(name = "userId")
    @Fetch(FetchMode.SUBSELECT)
    private List<FetchModeSubselectAddress> addresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<FetchModeSubselectAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<FetchModeSubselectAddress> addresses) {
        this.addresses = addresses;
    }
}
