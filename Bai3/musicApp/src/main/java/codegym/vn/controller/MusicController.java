package codegym.vn.controller;

import codegym.vn.entity.Music;
import codegym.vn.entity.MusicForm;
import codegym.vn.service.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Value("${file-upload}")
    private String fileUpload;
    MusicServiceImpl musicService = new MusicServiceImpl();
    @GetMapping("list")
    public String showList(Model model){
        model.addAttribute("musicList", musicService.findAll());
        return "/music/list";
    }

    private List<String> getFormatSong() {
        List<String> formatSongs = new ArrayList<>();
        formatSongs.add("Nhạc trẻ");
        formatSongs.add("Nhạc cổ điển");
        formatSongs.add("Nhạc rock");
        formatSongs.add("Nhạc trữ tình");
        return formatSongs;
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("songForm", new Music());
        model.addAttribute("types", getFormatSong());
        return "/music/create";
    }
    @PostMapping ("/create")
    public String saveProduct(@ModelAttribute MusicForm musicForm ) {
            MultipartFile multipartFile = musicForm.getSongPath();
            String fileName = multipartFile.getOriginalFilename();
            try {
                FileCopyUtils.copy(musicForm.getSongPath().getBytes(), new File(fileUpload + fileName));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Music music = new Music(musicForm.getId(), musicForm.getNameSong(),
                    musicForm.getPerformanceArtist(),musicForm.getKind(), fileName);
            musicService.create(music);
            return "redirect:/music/list";
        }
}
