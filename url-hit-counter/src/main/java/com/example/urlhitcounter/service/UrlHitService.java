package com.example.urlhitcounter.service;

import com.example.urlhitcounter.model.UrlHit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UrlHitService {
    static Map<String, Integer> map = new HashMap<>();

public Map<String, Integer> findAll() {
    return map;
}

    public UrlHit getUrlHit(String username) {
        int count = map.getOrDefault(username, 0) + 1;
        map.put(username, count);

        UrlHit urlHit = new UrlHit(username, count);
        return urlHit;
    }
}
