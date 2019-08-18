package hibernate.example.fetchmode_join;

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
public class FetchModeJoinUser {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @OneToMany
    @JoinColumn(name = "userId")
    @Fetch(FetchMode.JOIN)
    private List<FetchModeJoinAddress> addresses;

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

    public List<FetchModeJoinAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<FetchModeJoinAddress> addresses) {
        this.addresses = addresses;
    }
}
