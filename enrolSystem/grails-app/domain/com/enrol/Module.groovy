package com.enrol

class Module {

    String moduleTitle
    String lecturerName

    static constraints = {
        moduleTitle blank:false, nullable:false
        lecturerName blank:false, nullable:false
        course blank:true, nullable:true
    }
static belongsTo = [course:Course]
}