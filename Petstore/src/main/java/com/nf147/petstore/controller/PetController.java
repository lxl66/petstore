package com.nf147.petstore.controller;


import com.nf147.petstore.dao.PetMapper;
import com.nf147.petstore.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetMapper petMapper;
    @RequestMapping(method = RequestMethod.GET)
    public String selectAll1(Model model){
        List<Pet> petList=petMapper.selectAll();
        model.addAttribute("petList",petList);
        return "home";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String add( Pet pet) {
        petMapper.insert(pet);
        return "redirect:/pet";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String del(int caId) {
        petMapper.deleteByPrimaryKey(caId);
        return "redirect:/pet";
    }
}
