package hibernate.example.nplusone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NplusOneController {

    private final NplusOneUserRepository nplusOneUserRepository;

    public NplusOneController(NplusOneUserRepository nplusOneUserRepository) {
        this.nplusOneUserRepository = nplusOneUserRepository;
    }

    @GetMapping("/np1/users")
    public List<NplusOneUser> getUsers() {
        return nplusOneUserRepository.findAll();
    }
}
