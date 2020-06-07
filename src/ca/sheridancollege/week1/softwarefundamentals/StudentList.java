/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author rsidh
 */
public class StudentList {
    public static void main(String[] args) {
         //1.create an array of students
        Student[] sList=new Student[5];
        
        
        //2.Put names in the array
        for(int i=0; i<=sList.length-1;i++){
            sList[i]=new Student();
            sList[i].setName("Student" +(i+1));
        }
        
        
        //3.Print the array
        for(Student s:sList)
        {
            System.out.println("The Student Name is:"+s.getName());
        }
    }
    
}
