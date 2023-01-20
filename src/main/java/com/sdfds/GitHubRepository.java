package com.sdfds;

import jakarta.persistence.*;
import java.util.Objects;
@Entity
public class GitHubRepository {

    @Id
    @SequenceGenerator(
            name = "githubrepository_id_sequence",
            sequenceName = "githubrepository_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "githubrepository_id_sequence"
    )


    private Integer id;
    private String repoName;
    private String type;

    public GitHubRepository() {
        this.id = id;
        this.repoName = repoName;
        this.type = type;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitHubRepository that = (GitHubRepository) o;
        return Objects.equals(id, that.id) && Objects.equals(repoName, that.repoName) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repoName, type);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "GitHubRepository{" +
                "id=" + id +
                ", repoName='" + repoName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

