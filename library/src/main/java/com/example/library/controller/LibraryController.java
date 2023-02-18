package com.example.library.controller;

import com.example.library.model.Library;
import com.example.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Library")
public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @PostMapping("/add-library")
    public void addLibrary(@RequestBody Library library) {
        libraryService.addLibrary(library);
    }

    @GetMapping("/find-all")
    public List<Library> findAll() {
        return libraryService.findAll();
    }
    @GetMapping("/findById/id/{id}")
    public Library findById(@PathVariable int id) {
        return libraryService.findById(id);
    }

    @PutMapping("/add-library")
    public void addLibrary(@PathVariable int id, @RequestBody Library newLibrary) {
        libraryService.updateLibrary(id, newLibrary);
    }
    @DeleteMapping("/delete-library")
    public void deleteLibrary(@PathVariable int id) {
        libraryService.deleteLibrary(id);
    }
}
