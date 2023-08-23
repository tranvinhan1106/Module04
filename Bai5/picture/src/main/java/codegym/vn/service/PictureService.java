package codegym.vn.service;

import codegym.vn.entity.Picture;

import java.util.List;

public interface PictureService {
    List<Picture> findAll();
    void create(Picture picture);
}
