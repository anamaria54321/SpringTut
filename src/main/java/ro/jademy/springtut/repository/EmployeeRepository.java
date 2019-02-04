package ro.jademy.springtut.repository;

import org.springframework.data.repository.CrudRepository;
import ro.jademy.springtut.model.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,String > {

    @Override
    List<Employee> findAll();

}
