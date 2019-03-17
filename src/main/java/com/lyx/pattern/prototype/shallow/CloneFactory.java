package com.lyx.pattern.prototype.shallow;

import com.lyx.pattern.prototype.Person;

public class CloneFactory {

    private Person person;

    public CloneFactory(Person person){
        this.person = person;
    }

    public Person startClone(){
        return person.clonePerson();
    }
}
