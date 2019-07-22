package hibernate.example.batchsize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BatchSizeController {

    private final BatchSizeUserRepository batchSizeUserRepository;

    public BatchSizeController(BatchSizeUserRepository batchSizeUserRepository) {
        this.batchSizeUserRepository = batchSizeUserRepository;
    }

    @GetMapping("/bs/users")
    public List<BatchSizeUser> getUsers() {
        return batchSizeUserRepository.findAll();
    }
}
