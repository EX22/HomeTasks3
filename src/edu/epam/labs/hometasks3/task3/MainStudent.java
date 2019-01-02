package edu.epam.labs.hometasks3.task3;

import java.util.ArrayList;

public class MainStudent {

    public static void main(String[] args) {

        Student [] students = new Student[10];
        students[0] = new Student("Student One", 14, new int[5]);
        students[1] = new Student("Student Two", 23, new int[5]);
        students[2] = new Student("Student Three", 14, new int[5]);
        students[3] = new Student("Student Four", 23, new int[5]);
        students[4] = new Student("Student Five", 8, new int[5]);
        students[5] = new Student("Student Six", 23, new int[5]);
        students[6] = new Student("Student Seven", 14, new int[5]);
        students[7] = new Student("Student Eight", 8, new int[5]);
        students[8] = new Student("Student Nine", 8, new int[5]);
        students[9] = new Student("Student Ten", 23, new int[5]);

        //marks examples

        int [] studentsSixMarks = new int[]{9,10,9,9,10};
        students[5].setSubjectsMarks(studentsSixMarks);

        int [] studentsOneMarks = new int[]{8,9,10,10,10};
        students[0].setSubjectsMarks(studentsOneMarks);

        int [] studentsFiveMarks = new int[]{10,10,9,9,9};
        students[4].setSubjectsMarks(studentsFiveMarks);

        int [] studentsEightMarks = new int[]{9,9,10,9,7};
        students[7].setSubjectsMarks(studentsEightMarks);


        MainStudent mainStudent = new MainStudent();
        ArrayList<Student> selectedStudents = mainStudent.getStudentsByMarks(students, 9, 10);
        for (Student s: selectedStudents) {
            System.out.println(s.getSurnameNP() + " group № " + s.getGroupNumber());
        }


    }

    /**
     * The method compares marks contained in studentsMarks list with required markOne and markTwo,
     * if all marks in studentsMarks list match with required marks then the method add this particular student
     * in nerds list.
     * @param students list of students.
     * @param markOne first desirable mark that should be contained in student's subjectsMarks list.
     * @param markTwo second desirable mark that should be contained in student's subjectsMarks list.
     * @return nerds list of students whose marks match with required.
     */
    public ArrayList <Student> getStudentsByMarks(Student [] students, int markOne, int markTwo){
        ArrayList <Student> nerds = new ArrayList<>();
        int marksCount;
        for (Student student : students) {
            marksCount = 0;
            int[] someMarks = student.getSubjectsMarks();
            for (int someMark : someMarks) {
                if (someMark == markOne || someMark == markTwo) {
                    marksCount++;
                }
            }
            if (marksCount == someMarks.length){
                nerds.add(student);
            }
        }
        return nerds;
    }
}
