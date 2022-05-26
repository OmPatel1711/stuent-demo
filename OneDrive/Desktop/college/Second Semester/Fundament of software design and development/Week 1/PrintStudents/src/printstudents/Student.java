package printstudents;

import java.util.*;

public class Student {
    private String name;
    private int age;
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) 
    {
     // ARRAY OF OBJECT
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("MAX");
        s1.setAge(18);
        Student s2 = new Student();
        s2.setName("TAX");
        s2.setAge(19);
        Student s3 = new Student();
        s3.setName("FAX");
        s3.setAge(20);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0; i<list.length; i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    }
}