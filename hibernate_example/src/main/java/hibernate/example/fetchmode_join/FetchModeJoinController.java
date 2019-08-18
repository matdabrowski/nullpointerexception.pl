package hibernate.example.fetchmode_join;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FetchModeJoinController {

    private final FetchModeJoinUserRepository fetchModeJoinUserRepository;

    public FetchModeJoinController(FetchModeJoinUserRepository fetchModeJoinUserRepository) {
        this.fetchModeJoinUserRepository = fetchModeJoinUserRepository;
    }

    @GetMapping("/fmj/users")
    public List<FetchModeJoinUser> getUsers() {
        return fetchModeJoinUserRepository.findAll();
    }

    @GetMapping("/fmj/users/{id}")
    public FetchModeJoinUser getUser(@PathVariable Long id) {
        return fetchModeJoinUserRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not Found"));
    }
}
