package hibernate.example.joinfetch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoinFetchUserRepository extends JpaRepository<JoinFetchUser, Long> {

    @Override
    @Query("select distinct u from JoinFetchUser u join fetch u.addresses")
    List<JoinFetchUser> findAll();
}
