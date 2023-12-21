package sarrpc.tech.sprint_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarrpc.tech.sprint_boot.entites.Client;
import sarrpc.tech.sprint_boot.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
 //   @Autowired
   // ClientRepository clientRepository;
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client){
       Client clientDansBDD=this.clientRepository.findByEmail(client.getEmail());
       if(clientDansBDD==null) {
          this.clientRepository.save(client);
       }
    }
    public List<Client> rechercher(){
       return this.clientRepository.findAll();
    }
   public Client lire(int id){
       Optional<Client> optionalClient= this.clientRepository.findById(id);
       return optionalClient.orElse(null);
   }
   public Client lireOuCreer(Client clientAcreer){
        Client clientDansBDD=this.clientRepository.findByEmail(clientAcreer.getEmail());
        if(clientDansBDD==null){
            clientDansBDD=this.clientRepository.save(clientAcreer);
        }
        return  clientDansBDD;
   }
    public void modifier(int id, Client client) {
        Client clientDansBDD=this.lire(id);
        if(clientDansBDD.getId()==client.getId()){
            clientDansBDD.setEmail(client.getEmail());
            clientDansBDD.setTelephone(client.getTelephone());
            this.clientRepository.save(clientDansBDD);
        }
    }
}
