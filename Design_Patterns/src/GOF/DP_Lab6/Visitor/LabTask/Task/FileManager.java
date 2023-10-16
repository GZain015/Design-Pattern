///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package GOF.DP_Lab6.Visitor.LabTask.Task;
//
///**
// *
// * @author Zain
// */
//
//import GOF.DP_Lab6.Visitor.LabTask.Task.*;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FileManager {
//    private static final String STUDENTS_FILE = "Students.txt";
//
//    public static void saveStudent(Student student) throws IOException {
//        try catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<Student> loadStudents() throws FileNotFoundException, IOException {
//        List<Student> students = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(STUDENTS_FILE)) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(",");
//                if (parts.length == 4) {
//                    int id = Integer.parseInt(parts[0]);
//                    String name = parts[1];
//                    int age = Integer.parseInt(parts[2]);
//                    String department = parts[3];
//                    students.add(new Student(id, name, age, department));
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return students;
//    }
//
//    public static void updateStudent(Student updatedStudent) {
//        List<Student> students = loadStudents();
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId() == updatedStudent.getId()) {
//                students.set(i, updatedStudent);
//                saveStudents(students);
//                break;
//            }
//        }
//    }
//
//    public static void deleteStudent(int studentId) throws IOException {
//        List<Student> students = loadStudents();
//        students.removeIf(student -> student.getId() == studentId);
//        saveStudents(students);
//    }
//
//    private static void saveStudents(List<Student> students) throws IOException {
//        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(STUDENTS_FILE))) {
//            for (Student student : students) {
//                writer.println(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getDepartment());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    
//}
//
//  
//    