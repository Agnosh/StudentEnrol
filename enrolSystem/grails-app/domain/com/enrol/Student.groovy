package com.enrol

class Student {

    //Variables
    String studentID
    String studentName
    Date dob
    Boolean isFundingAvailable
    String studentEmail
    String studentUsername
    String studentPassword
    Course course

    static constraints = {
        studentID blank:false, nullable:false
        studentName blank:false, nullable:false
        dob blank:false, nullable:false
        isFundingAvailable blank:false, nullable:false
        studentEmail blank:false, nullable:false, email:true
        studentUsername blank:false, nullable:false, unique:true
        studentPassword blank:false, nullable:false
        course blank:false, nullable:false
    }
}
