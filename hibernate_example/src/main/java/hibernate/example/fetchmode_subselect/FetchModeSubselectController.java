package hibernate.example.fetchmode_subselect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FetchModeSubselectController {

    private final FetchModeSubselectUserRepository fetchModeSubselectUserRepository;

    public FetchModeSubselectController(FetchModeSubselectUserRepository fetchModeSubselectUserRepository) {
        this.fetchModeSubselectUserRepository = fetchModeSubselectUserRepository;
    }

    @GetMapping("/fms/users")
    public List<FetchModeSubselectUser> getUsers() {
        return fetchModeSubselectUserRepository.findAll();
    }

    @GetMapping("/fms/users/{id}")
    public FetchModeSubselectUser getUser(@PathVariable Long id) {
        return fetchModeSubselectUserRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not Found"));
    }
}
