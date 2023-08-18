package codegym.vn.entity;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class Music {
    private String id;
    private String nameSong;
    private String performanceArtist;
    private List<String> kind;

    private String songPath;


    public Music() {
    }

    public Music(String id, String nameSong, String performanceArtist, List<String> kind, String songPath) {
        this.id = id;
        this.nameSong = nameSong;
        this.performanceArtist = performanceArtist;
        this.kind = kind;
        this.songPath = songPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getPerformanceArtist() {
        return performanceArtist;
    }

    public void setPerformanceArtist(String performanceArtist) {
        this.performanceArtist = performanceArtist;
    }

    public List<String> getKind() {
        return kind;
    }

    public void setKind(List<String> kind) {
        this.kind = kind;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }
}
