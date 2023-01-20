package com.sdfds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/sensor")
public class Main {

    private final GhAPIRepository ghAPIRepository;

    public Main(GhAPIRepository ghAPIRepository) {
        this.ghAPIRepository = ghAPIRepository;
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
    @GetMapping
    public List<GhAPIRepository> getGithubRepository(){
        return GhAPIRepository.findAll();
    }
    record NewGithubRequest (
            int id,
            String repoName,
            String type)   {

    }
    @PostMapping
    public void addGitHubRepository(@RequestBody NewGithubRequest request){

        GitHubRepository gitHubRepository = new GitHubRepository();
        gitHubRepository.setRepoName(request.repoName());
        gitHubRepository.setType(request.type());
    }
    @DeleteMapping("{id}")
    public void deleteGitHubRepository(@PathVariable("id") Integer id) {
        GhAPIRepository.deleteById(id);
    }

}
