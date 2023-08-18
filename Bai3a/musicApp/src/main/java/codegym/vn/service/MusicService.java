package codegym.vn.service;

import codegym.vn.entity.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();

    void create(Music music);
}
