package hibernate.example.fetchmode_join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchModeJoinUserRepository extends JpaRepository<FetchModeJoinUser, Long> {
}
