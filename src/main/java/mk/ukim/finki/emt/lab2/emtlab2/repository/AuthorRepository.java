package mk.ukim.finki.emt.lab2.emtlab2.repository;

import mk.ukim.finki.emt.lab2.emtlab2.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
