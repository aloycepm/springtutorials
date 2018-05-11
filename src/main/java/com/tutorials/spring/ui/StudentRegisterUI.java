package com.tutorials.spring.ui;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route("student/register")
public class StudentRegisterUI extends FormLayout {


    public StudentRegisterUI() {
        setWidth("100vw");

    }
}
