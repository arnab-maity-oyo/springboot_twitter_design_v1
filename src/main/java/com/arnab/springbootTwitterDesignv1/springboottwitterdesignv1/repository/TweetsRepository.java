package com.arnab.springbootTwitterDesignv1.springboottwitterdesignv1.repository;

import com.arnab.springbootTwitterDesignv1.springboottwitterdesignv1.model.Tweets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetsRepository extends JpaRepository<Tweets, Long> {
}
