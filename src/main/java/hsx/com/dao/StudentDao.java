package hsx.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hsx.com.entity.Student;

/**
 * 学生信息Dao接口
 * @author Administrator
 *
 */
public interface StudentDao extends JpaRepository<Student,Integer>{

}
