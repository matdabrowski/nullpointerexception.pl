package hibernate.example.nplusone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NplusOneUserRepository extends JpaRepository<NplusOneUser, Long> {
}
