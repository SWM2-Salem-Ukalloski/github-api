package com.sdfds;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GhAPIRepository extends JpaRepository<GitHubRepository, Integer> {
}
