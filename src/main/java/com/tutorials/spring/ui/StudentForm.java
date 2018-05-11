package com.tutorials.spring.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;

public class StudentForm extends Composite<Div> {

    StudentTextField firstName
            = new StudentTextField("First Name");


    public StudentForm() {

    }
}
