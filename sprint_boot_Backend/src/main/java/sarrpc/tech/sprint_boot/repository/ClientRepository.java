package sarrpc.tech.sprint_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sarrpc.tech.sprint_boot.entites.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    Client findByEmail(String email);
}
