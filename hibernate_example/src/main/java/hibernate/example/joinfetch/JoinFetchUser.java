package hibernate.example.joinfetch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "user")
public class JoinFetchUser {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @OneToMany
    @JoinColumn(name = "userId")
    private List<JoinFetchAddress> addresses;

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

    public List<JoinFetchAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<JoinFetchAddress> addresses) {
        this.addresses = addresses;
    }
}
