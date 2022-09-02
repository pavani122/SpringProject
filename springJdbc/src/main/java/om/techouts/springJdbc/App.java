package om.techouts.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new 
        		ClassPathXmlApplicationContext("om/techouts/springJdbc/config.jdbc.xml");
        
        StudDao s=(StudDao)context.getBean("studdao");
		/*
		 * s.update(new Student("Yashu","Reddy",19),2);
		 * 
		 * Student s1=new Student(); s1.setFirstName("jjjj"); s1.setLastName("rrrr");
		 * s1.setAge(4); s.save(s1);
		 * 
		 * s.delete(3);
		 */
        
        //preparedstatement
//        Student s1=new Student();
//        s1.setId(6);
//        s1.setFirstName("pavani");
//        s1.setLastName("yadav");
//		s1.setAge(20); 
//        s.saveStudentByPreparedStatement(s1);
        
        Student s1=s.getStudentById(4);
        System.out.println("Student by id:");
        System.out.println(s1.getId()+":"+s1.getFirstName()+":"+s1.getLastName()+":"+s1.getAge());

        List<Student> student=s.getAllStudents();
        System.out.println("Student data(List)");
        System.out.println(student.size());
        for(Student stu:student)
        {
        	System.out.println(stu.getId()+":"+stu.getFirstName()+":"+stu.getLastName()+":"+stu.getAge());
        }
        System.out.println("success");
    }
}
