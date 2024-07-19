package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.employe.Employe;

public interface EmpRepo extends JpaRepository<Employe, Integer> {

}

