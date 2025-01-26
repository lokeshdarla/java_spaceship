package org.lokeshdarla.blogapp.Controllers;

import org.lokeshdarla.blogapp.Models.Tag;
import org.lokeshdarla.blogapp.Services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tags")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Tag> getAllTags() {
        return this.tagService.getAllTags();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tag createTag(@RequestBody Tag tag) {
        return this.tagService.saveTag(tag);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTagById(@PathVariable String id){
        this.tagService.deleteTag(id);
    }

}
