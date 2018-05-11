package com.tutorials.spring.repository;

import com.tutorials.spring.model.ClassRoom;
import org.springframework.data.repository.CrudRepository;

public interface ClassRoomRepository extends CrudRepository<ClassRoom, Long> {
}
