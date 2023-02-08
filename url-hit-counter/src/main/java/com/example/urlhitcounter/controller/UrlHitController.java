package com.example.urlhitcounter.controller;

import com.example.urlhitcounter.model.UrlHit;
import com.example.urlhitcounter.service.UrlHitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class UrlHitController {

    private UrlHitService urlHitService; // dependency-injection

    public UrlHitController(UrlHitService urlHitService) {
        this.urlHitService = urlHitService;
    }

    @GetMapping("/username/{username}/count")
    public UrlHit getCount(@PathVariable String username) {
        UrlHit urlHit = urlHitService.getUrlHit(username);
        return urlHit;
    }

    @GetMapping("find-all")
    public Map<String, Integer> printAll() {
        return urlHitService.findAll();
    }
}
