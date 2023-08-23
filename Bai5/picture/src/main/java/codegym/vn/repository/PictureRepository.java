package codegym.vn.repository;

import codegym.vn.entity.Picture;

import java.util.List;

public interface PictureRepository {
    List<Picture> findAll();
    void create(Picture picture);
}
