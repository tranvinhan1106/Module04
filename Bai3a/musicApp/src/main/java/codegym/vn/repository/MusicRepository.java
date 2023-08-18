package codegym.vn.repository;

import codegym.vn.entity.Music;

import java.util.List;

public interface MusicRepository {
    void create(Music music);
    List<Music> findAll();

}
