package com.studentkubernetesdemo.studentkubernetesdemo;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
