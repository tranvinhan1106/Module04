package codegym.vn.service;

import codegym.vn.entity.Medical;

import java.util.List;

public interface MedicalService {
    Medical findById(String id);
    void update(Medical medical);
    List<Medical> findAll();
    void  add(Medical medical);
}
