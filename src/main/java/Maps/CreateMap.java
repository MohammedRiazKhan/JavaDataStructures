package Maps;

import com.sun.javafx.collections.MappingChange;

import java.util.Map;

public class CreateMap {

    public static void main(String[] args){


        MapImplementation subjectsMap = new MapImplementation();
        subjectsMap.put("ADF1", "Applications Development Foundations 1");
        subjectsMap.put("CNF1", "Computer Network Foundations 1");
        subjectsMap.put("MUF1", "Multimedia Foundations 1");
        subjectsMap.put("PRC2", "Professional Communication 2");
        subjectsMap.put("INM2", "Information Management 2");
        subjectsMap.put("PRT1", "Project 1");

        System.out.println("Map With Subjects Populated");
        subjectsMap.print();

        System.out.println(" ");
        //removing one subject
        subjectsMap.remove("MUF1");
        System.out.println("After Removing a Subject");
        subjectsMap.print();
        System.out.println(" ");

        MapImplementation marksMap = new MapImplementation();
        marksMap.put("ADF1", 80);
        marksMap.put("CNF1", 78);
        marksMap.put("MUF1", 67);
        marksMap.put("PRC2", 71);
        marksMap.put("INM2", 84);
        marksMap.put("PRT1", 72);

        System.out.println("Marks 50% or Above");
        marksMap.checkMarks();

        System.out.println(" ");
        
        System.out.println("Marks lower than 50%");
        marksMap.getLowestMark();


    }

}
