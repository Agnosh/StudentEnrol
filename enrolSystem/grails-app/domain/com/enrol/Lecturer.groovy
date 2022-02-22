package com.enrol

class Lecturer {

    String lecturerID
    String lecturerName
    Date dob
    String lecturerEmail
    String lecturerUsername
    String lecturerPassword
    Course course

    static constraints = {
        lecturerID blank:false, nullable:false
        lecturerName blank:false, nullable:false
        dob blank:false, nullable:false
        lecturerEmail blank:false, nullable:false, email:true
        lecturerUsername blank:false, nullable:false, unique:true
        lecturerPassword blank:false, nullable:false
        course blank:true, nullable:true
    }
static hasMany = [course:Course]
}