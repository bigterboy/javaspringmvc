package com.laptrinhjavaweb.controller.service.impl;

import com.laptrinhjavaweb.controller.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public List<String> loadMenu() {
        List<String> menus = new ArrayList<>();
        menus.add("Blog java web");
        menus.add("Hướng dẫn học java web");
        menus.add("MENU3");
        menus.add("MENU4");

        return menus;
    }
}
