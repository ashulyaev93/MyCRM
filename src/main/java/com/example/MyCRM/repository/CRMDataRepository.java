package com.example.MyCRM.repository;

import com.example.MyCRM.models.MyCRM;
import com.example.MyCRM.models.roles.Administrator;
import com.example.MyCRM.models.roles.Manager;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface CRMDataRepository extends CrudRepository<MyCRM, String> {
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "insert into my_crm values (?1,?2, ?3)")
    void saveLog(String expression, float result);

    @Query(nativeQuery = true, value = "select * from history_calculation where date >= ?1 and date <= ?2")
    List<Administrator> getLogByDateInterval(String fromDate, String toDate);

    @Query(nativeQuery = true, value = "select * from history_calculation where expression = ?1")
    List<Manager> getLogByExpression(String expression);


}
