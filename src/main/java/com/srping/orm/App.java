package com.srping.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srping.orm.dao.StudentDao;
import com.srping.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("ormconfig.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student=new Student(1234,"Durgesh Tiwari","Lucknow");
        int r = studentDao.insert(student);
        System.out.println(r);
        
        
    }
}
