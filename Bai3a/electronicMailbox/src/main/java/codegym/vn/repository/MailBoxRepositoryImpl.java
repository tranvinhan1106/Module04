package codegym.vn.repository;

import codegym.vn.entity.Mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailBoxRepositoryImpl implements MailBoxRepository {
    private static Map<String, Mail> mailMap;

    static {
        mailMap = new HashMap<>();
        mailMap.put("1", new Mail("1", "English", "5", "Cho phep", "Chiếc thuyền ngoài xa"));
        mailMap.put("2", new Mail("2", "Japanese", "10", "Ko cho phep", "Vợ nhặt"));
        mailMap.put("3", new Mail("3", "Chinese", "15", "Cho phep", "Chí Phèo"));
        mailMap.put("4", new Mail("4", "Vietnamese", "20", "Ko cho phep", "Người lái đò sông Đà"));
    }


    @Override
    public List<Mail> findAll() {
        return new ArrayList<>(mailMap.values());
    }

    @Override
    public void update(Mail mail) {
        if (mailMap.containsKey(mail.getId())) {
            mailMap.put(mail.getId(), mail);
        }
    }

    @Override
    public Mail findById(String id) {
        return mailMap.get(id);
    }
}
