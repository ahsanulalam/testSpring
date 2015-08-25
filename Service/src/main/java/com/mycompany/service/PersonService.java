/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.service;

import com.mycompany.model.Person;
/**
 *
 * @author HP
 */
public interface PersonService {
	public Person getRandom();
	public Person getById(Long id);
	public void save(Person person);
}

