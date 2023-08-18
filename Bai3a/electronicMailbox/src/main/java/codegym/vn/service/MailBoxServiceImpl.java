package codegym.vn.service;

import codegym.vn.entity.Mail;
import codegym.vn.repository.MailBoxRepositoryImpl;

import java.util.List;

public class MailBoxServiceImpl implements MailBoxService {
    MailBoxRepositoryImpl mailBoxRepository = new MailBoxRepositoryImpl();

    @Override
    public List<Mail> findAll() {
        return mailBoxRepository.findAll();
    }

    @Override
    public void update(Mail mail) {
        mailBoxRepository.update(mail);
    }

    @Override
    public Mail findById(String id) {
        return mailBoxRepository.findById(id);
    }
}
