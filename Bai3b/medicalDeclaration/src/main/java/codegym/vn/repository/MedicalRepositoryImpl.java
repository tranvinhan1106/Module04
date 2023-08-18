package codegym.vn.repository;

import codegym.vn.entity.Medical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedicalRepositoryImpl implements MedicalRepository{
    private static Map<String , Medical> medicalMap;
    static {
        medicalMap = new HashMap<>();
        medicalMap.put("1" , new Medical("1","AnTran","2004","Nam","VietNam","01000100","oto","43D1111","12","11/06/2004","11/06/2022","Không","Đanang","Cam Le - Da Nang ", "0397 xxx xxx", "Antran@gmail.com","Ho","Tiếp xúc gần"));
    }
    @Override
    public Medical findById(String id) {
        return medicalMap.get(id);
    }

    @Override
    public void update(Medical medical) {
        medicalMap.put(medical.getId(),medical);
    }

    @Override
    public List<Medical> findAll() {
        return new ArrayList<>(medicalMap.values());
    }

    @Override
    public void add(Medical medical) {
        medicalMap.put(medical.getId(),medical);
    }
}
