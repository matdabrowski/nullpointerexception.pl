package hibernate.example.batchsize;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchSizeUserRepository extends JpaRepository<BatchSizeUser, Long> {
}
