package codegym.vn.service;

import codegym.vn.entity.Medical;
import codegym.vn.repository.MedicalRepositoryImpl;

import java.util.List;

public class MedicalServiceImpl implements MedicalService {
    MedicalRepositoryImpl medicalRepository = new MedicalRepositoryImpl();

    @Override
    public Medical findById(String id) {
        return medicalRepository.findById(id);
    }

    @Override
    public void update(Medical medical) {
        medicalRepository.update(medical);
    }

    @Override
    public List<Medical> findAll() {
        return medicalRepository.findAll();
    }

    @Override
    public void add(Medical medical) {
        medicalRepository.add(medical);
    }
}
