package com.influencer.dao;

import com.influencer.model.Person;

import java.util.List;


public interface PersonDAO {

    void save(Person p);

    List<Person> list();

}

