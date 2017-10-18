package be.hayk.testapp.data.repositories;

import be.hayk.testapp.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Hayk
 */
public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
    
}
