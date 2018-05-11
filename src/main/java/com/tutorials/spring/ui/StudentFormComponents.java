package com.tutorials.spring.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.dom.ElementFactory;

@Tag("div")
public class StudentFormComponents
        extends Component
        implements HasComponents {

    public void add(Component child) {
        Element childWrapper = ElementFactory.createDiv();
        childWrapper.appendChild(child.getElement());
        getElement().appendChild(childWrapper);
    }


    public void remove(Component child) {
        Element wrapper = child.getElement().getParent();
        wrapper.removeFromParent();
    }
}
