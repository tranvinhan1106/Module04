package codegym.vn.repository;

import codegym.vn.entity.Medical;

import java.util.List;

public interface MedicalRepository {
    Medical findById(String id);
    void update(Medical medical);
    List<Medical> findAll();
    void  add(Medical medical);
}
