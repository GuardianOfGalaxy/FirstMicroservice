package com.firstmicroservice.repositories;

import com.firstmicroservice.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RaMzEsS on 25.07.2016.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findAll();
}
