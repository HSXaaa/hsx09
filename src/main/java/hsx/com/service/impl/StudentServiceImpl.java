package hsx.com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hsx.com.dao.StudentDao;
import hsx.com.entity.Student;
import hsx.com.service.StudentService;

/**
 * 学生信息Service实现类
 * @author Administrator
 *
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{
	
	@Resource
	private StudentDao studentDao;
	
	@Override
	public void add(Student student) {
		studentDao.save(student);
	}

}
