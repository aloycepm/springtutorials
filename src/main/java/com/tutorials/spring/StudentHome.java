package com.tutorials.spring;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.*;


@Route("student/home")
public class StudentHome extends Div implements BeforeEnterObserver {
    public StudentHome() {
        setText("Student home route..");
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // implementation omitted
        Object record = getItem();

        if (record == null) {
            event.rerouteTo(NoItemsView.class);
        }
    }

    private Object getItem() {
        // no-op implementation
        return null;
    }
}