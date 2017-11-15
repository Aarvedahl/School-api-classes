package io.github.aarvedahl;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DtoStudent {
    @XmlElement private String name;


    @XmlElementWrapper(name="courses")
    @XmlElement(name="course")
    private List<DtoCourse> courseList;

    public DtoStudent() {}

    public DtoStudent(String name) {
        this.name = name;
        courseList = new ArrayList<>();
    }

    public void addCourse(DtoCourse course) {
        courseList.add(course);
    }

    public List<DtoCourse> getCourseList() {
        return courseList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
