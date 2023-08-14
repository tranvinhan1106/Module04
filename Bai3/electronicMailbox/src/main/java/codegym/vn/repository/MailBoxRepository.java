package codegym.vn.repository;

import codegym.vn.entity.Mail;

import java.util.List;

public interface MailBoxRepository {

    List<Mail> findAll();

    void update(Mail mail);

    Mail findById(String id);
}
