package com.example.juwapp.model;

import java.util.ArrayList;
import java.util.List;

public class DepartList {
    String DepartmentName;
    List<SubDepart> subDepartsList = new ArrayList<>();

    public DepartList(String departmentName, List<SubDepart> subDepartsList) {
        DepartmentName = departmentName;
        this.subDepartsList = subDepartsList;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public List<SubDepart> getSubDepartsList() {
        return subDepartsList;
    }
}
