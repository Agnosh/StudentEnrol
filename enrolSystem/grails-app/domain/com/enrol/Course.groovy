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

    String toString(){
        return courseTitle
    }

    static constraints = {
        courseTitle blank:false, nullable:false, size:15..30, unique:true
        department blank:false, nullable:false, size:5..15
        courseLeader blank:false, nullable:false
        courseCode blank:false, nullable:false
        numberOfStudents blank:false, nullable:false, min:10
        startDate blank:false, nullable:false
        endDate blank:false, nullable:false
        studyMode blank:false, nullable:false
        description blank:false, nullable:false
        tuitionFees blank:false, nullable:false, scale:2
    }
static hasMany = [students:Students]
}