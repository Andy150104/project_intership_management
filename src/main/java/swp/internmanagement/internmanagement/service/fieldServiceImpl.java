package swp.internmanagement.internmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swp.internmanagement.internmanagement.entity.Field;
import swp.internmanagement.internmanagement.repository.fieldRepository;

@Service
public class fieldServiceImpl implements fieldService{

    @Autowired
    private fieldRepository fieldRepository;

    @Override
    public List<Field> getAllField() {
        return fieldRepository.findAll();
    }
}
