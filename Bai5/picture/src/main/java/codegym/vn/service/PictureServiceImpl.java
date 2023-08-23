package codegym.vn.service;

import codegym.vn.entity.Picture;
import codegym.vn.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureRepository pictureRepository;

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }

    @Override
    public void create(Picture picture) {
        pictureRepository.create(picture);
    }
}
