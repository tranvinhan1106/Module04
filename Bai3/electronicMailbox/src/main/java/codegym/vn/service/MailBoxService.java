package codegym.vn.service;

import codegym.vn.entity.Mail;

import java.util.List;

public interface MailBoxService {
    List<Mail> findAll();

    void update(Mail mail);

    Mail findById(String id);
}
