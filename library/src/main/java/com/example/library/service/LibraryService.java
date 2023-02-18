package com.example.library.service;

import com.example.library.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Service
public class LibraryService {
    private static List<Library> libraries = new ArrayList<>();
    private static int id = 0;

    static {
        libraries.add(new Library("Delhi", "New Delhi", "011 2399 2315", "Public", ++id));
        libraries.add(new Library("American Centre Library", "24 Kasturba Gandhi Marg, New Delhi", "011 2399 2315", "Public", ++id));
        libraries.add(new Library("British Council Library", "17 Kasturba Gandhi Marg, New Delhi", "011 2399 2315", "Private", ++id));
        libraries.add(new Library("Delhi University Library", "University Road, Delhi", "011 2399 2315", "Student", ++id));
        libraries.add(new Library("Indian Institute of Technology", "IIT Delhi Hauz Khas, New Delhi", "011 2399 2315", "Student", ++id));
    }

    public List<Library> findAll() {
        return libraries;
    }
    public Library findById(int id) {
        Predicate<? super Library> predicate = library -> library.getLibraryId() == id;
        Library library = libraries.stream().filter(predicate).findFirst().get();
        return library;
    }
    public void addLibrary(Library library) {
        libraries.add(library);
    }
//    optional
    public void deleteLibrary(int id) {
        Predicate<? super Library> predicate = library -> library.getLibraryId() == id;
        libraries.removeIf(predicate);
    }

    public void updateLibrary(int id, Library newLibrary) {
        Library library = findById(id);
        library.setLibraryId(newLibrary.getLibraryId());
        library.setLibraryAdd(newLibrary.getLibraryAdd());
        library.setLibraryName(newLibrary.getLibraryName());
        library.setLibraryNumber(newLibrary.getLibraryNumber());
        library.setFacilities(newLibrary.getFacilities());
    }
}
