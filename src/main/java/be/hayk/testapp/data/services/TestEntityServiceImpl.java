package be.hayk.testapp.data.services;

import be.hayk.testapp.data.repositories.TestEntityRepository;
import be.hayk.testapp.domain.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hayk
 */
@Service
public class TestEntityServiceImpl implements TestEntityService {

    private final TestEntityRepository testEntityRepository;
    
    @Autowired
    public TestEntityServiceImpl(TestEntityRepository testEntityRepository) {
        this.testEntityRepository = testEntityRepository;
    }
    
    @Override
    public TestEntity read(long id) {
        return testEntityRepository.getOne(id);
    }
    
}
