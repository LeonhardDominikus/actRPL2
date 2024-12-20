/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.leo;

import me.leo.controller.MahasiswaController;
import me.leo.service.MahasiswaService;
import me.leo.view.MahasiswaView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


/**
 *
 * @author attan
 */
@SpringBootApplication
public class Pertemuan6_50421746 implements ApplicationRunner {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(Pertemuan6_50421746.class, args);
        MahasiswaController controller = context.getBean(MahasiswaController.class);
        MahasiswaView mahasiswaView = new MahasiswaView(controller);
        mahasiswaView.setVisible(true);
        
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception{
        
    }
}
