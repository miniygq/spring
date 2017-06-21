package com.miniy.spring.web;

import com.sun.media.sound.SoftTuning;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2017/6/17.
 */
@Controller
@RequestMapping
public class HomeController {

    @RequestMapping(value = "/home",method= RequestMethod.GET)
    public String home(){
        return "home";
    }


    @RequestMapping(value = "/upfile",method = RequestMethod.POST)
    public void fileUpload(@RequestPart("upFile") MultipartFile upFile,
                           @RequestParam String note){
        System.out.println(upFile.getSize());
        System.out.println(note);

    }

}
