package REST_API.controller;
import REST_API.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/home")
    //@RequestMapping(value = "/home", method = RequestMethod.GET)
    public Student getStudent() {

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Satyapriya");
        s1.setAddress("BBsr");

        return s1;
    }

    @PostMapping("/createStudent")
    public String createStudent(@RequestBody Student s) {
        Student s1 = s;
        return "Completed";
    }
}