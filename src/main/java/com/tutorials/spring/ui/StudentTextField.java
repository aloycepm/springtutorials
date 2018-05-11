package com.tutorials.spring.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

public class StudentTextField extends Composite<Div> {
    private Label label = new Label();
    private TextField input = new TextField();

    public StudentTextField(String labelText) {

        label = new Label();
        label.setText(labelText);
        input = new TextField();
        input.setPlaceholder(labelText);
        getContent().setClassName("form-input");
        getContent().add(label, input);
    }

    public String getValue() {
        return input.getValue();
    }

    public void setValue(String value) {
        input.setValue(value);
    }

}
