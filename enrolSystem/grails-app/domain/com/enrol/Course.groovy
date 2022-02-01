package com.enrol

class Course {
    
//Variables
    String courseTitle
    String department
    String courseLeader
    String courseCode
    int numberOfStudents
    Date startDate
    Date endDate
    String studyMode
    String description
    Double tuitionFees

    static constraints = {
        courseTitle blank:false, nullable:false
        department blank:false, nullable:false
        courseLeader blank:false, nullable:false
        courseCode blank:false, nullable:false
        numberOfStudents blank:false, nullable:false
        startDate blank:false, nullable:false
        endDate blank:false, nullable:false
        studyMode blank:false, nullable:false
        description blank:false, nullable:false, description wiget:'textarea'
        tuitionFees blank:false, nullable:false, scale:2
    }
}
