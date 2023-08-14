package codegym.vn.service;

import codegym.vn.entity.Music;
import codegym.vn.repository.MusicRepositoryImpl;

import java.util.List;

public class MusicServiceImpl implements MusicService {
    MusicRepositoryImpl musicRepository = new MusicRepositoryImpl();

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void create(Music music) {
        musicRepository.create(music);
    }

}
