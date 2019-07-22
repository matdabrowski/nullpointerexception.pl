package hibernate.example.joinfetch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JoinFetchController {

    private final JoinFetchUserRepository joinFetchUserRepository;

    public JoinFetchController(JoinFetchUserRepository joinFetchUserRepository) {
        this.joinFetchUserRepository = joinFetchUserRepository;
    }

    @GetMapping("/jf/users")
    public List<JoinFetchUser> getUsers() {
        return joinFetchUserRepository.findAll();
    }
}
