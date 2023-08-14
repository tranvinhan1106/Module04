
package codegym.vn.repository;

import codegym.vn.entity.Music;

import java.util.*;

public class MusicRepositoryImpl implements MusicRepository {
    private static List<Music> musicList = new ArrayList<>();


    @Override
    public void create(Music music) {
        musicList.add(music);

    }

    @Override
    public List<Music> findAll() {
        return musicList;
    }

}
