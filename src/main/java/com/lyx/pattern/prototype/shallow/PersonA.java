package com.lyx.pattern.prototype.shallow;

import com.lyx.pattern.prototype.Person;


public class PersonA extends Person {

    @Override
    public Person clonePerson() {
        PersonA personA = new PersonA();
        personA.setName(this.name);
        personA.setAge(this.age);
        personA.setBirthday(this.birthday);
        personA.setHigh(this.high);
        personA.setWeigh(this.weigh);
        personA.setHobbies(this.hobbies);
        return personA;
    }
}
