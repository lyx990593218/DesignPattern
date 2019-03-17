package com.lyx.pattern.prototype.deep;

import com.lyx.pattern.prototype.XingGe;
import com.lyx.pattern.prototype.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class PersonB extends Person implements Cloneable, Serializable {

    public XingGe xingGe;

    public PersonB(){
        this.birthday = new Date();
        this.hobbies = new ArrayList();
        this.xingGe = new XingGe();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            PersonB copy = (PersonB)ois.readObject();
            copy.birthday = new Date();
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }

    public PersonB shallowClone(PersonB person){
        PersonB personB = new PersonB();
        personB.high = person.high;
        personB.age = person.age;
        personB.weigh = person.weigh;
        personB.birthday = new Date();
        personB.hobbies = person.hobbies;
        personB.xingGe = person.xingGe;
        return personB;
    }
}
