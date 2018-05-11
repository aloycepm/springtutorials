package com.tutorials.spring.repository;

import com.tutorials.spring.model.ClassRoom;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClassRoomRepository extends CrudRepository<ClassRoom, Long> {
    List<ClassRoom> findByName(String name);
}
