/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.leo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import me.leo.model.ModelMahasiswa;
import me.leo.service.MahasiswaService;

import java.util.List;
import org.springframework.stereotype.Controller;
/**
 *
 * @author attan
 */
@Controller
public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public String addMahasiswa(@RequestBody ModelMahasiswa mhs){
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa added succesfuly";
    }
    
    public ModelMahasiswa getMahasiswa(@PathVariable int id){
        return mahasiswaService.getMhs(id);
    }
    
    public String updateMahasiswa(@RequestBody ModelMahasiswa mhs){
        mahasiswaService.updateMhs(mhs);
        return "Mhasiswa updated succesfully";
    }
    
    public String deleteMahasiswa(@PathVariable int id){
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa Deleted Succesfully";
    }
    
    public List<ModelMahasiswa> getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
    }
}
