package com.angulardemo.spring.angularDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabourRepo extends JpaRepository<LabourDetails, Long> {

}
