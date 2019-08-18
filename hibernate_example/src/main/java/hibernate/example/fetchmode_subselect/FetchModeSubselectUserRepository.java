package hibernate.example.fetchmode_subselect;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchModeSubselectUserRepository extends JpaRepository<FetchModeSubselectUser, Long> {
}
