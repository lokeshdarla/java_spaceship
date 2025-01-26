package org.lokeshdarla.blogapp.Services;

import org.lokeshdarla.blogapp.Models.Tag;
import org.lokeshdarla.blogapp.Repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Stack;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAllTags() {
        return this.tagRepository.findAll();
    }

//    public List<Tag> getTagsByName(String name) {
//        return this.tagRepository.getTagsByName(name);
//    }

    public Tag getTagById(String id) {
        return this.tagRepository.findById(id).orElse(null);
    }

    public  Tag saveTag(Tag tag) {
        return this.tagRepository.save(tag);
    }

    public void deleteTag(String id) {
        this.tagRepository.deleteById(id);
    }
}
