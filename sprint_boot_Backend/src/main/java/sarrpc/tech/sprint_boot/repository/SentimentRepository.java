package sarrpc.tech.sprint_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sarrpc.tech.sprint_boot.emus.TypeSentiment;
import sarrpc.tech.sprint_boot.entites.Sentiment;

import java.util.List;

public interface SentimentRepository extends JpaRepository<Sentiment,Integer> {
    List<Sentiment>findByType(TypeSentiment type);
}
