package student_management_system.service.serviceImpl;

import org.springframework.stereotype.Service;
import student_management_system.entity.Student;
import student_management_system.repository.StudentRepository;
import student_management_system.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
