package com.tutorials.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route("student/register")
public class StudentRegister extends Div {
    private Span header1 = new Span("students StudentRegister");
    private Span header2 = new Span("Student registration system.");
    private TextField filterText = new TextField();
    private Button registerNew = new Button("StudentRegister New");
    private Button clear = new Button(new Icon(VaadinIcons.CLOSE_CIRCLE));
    private Button select = new Button("Select All");
    private Button deselect = new Button("Deselect All");
    private Button refresh = new Button("Refresh");
    private Grid<Student> grid = new Grid<>(Student.class);

    public StudentRegister() {

        filterText.setPlaceholder("Filter by lastname.....");
        HorizontalLayout filtering = new HorizontalLayout();
        filtering.setSpacing(false);
        filtering.add(filterText, clear);

        Div topper = new Div();
        topper.setClassName("top-bar");

        VerticalLayout topHeadings = new VerticalLayout();
        header1.setClassName("heading1");
        header2.setClassName("heading2");
        topHeadings.add(header1, header2);

        Div right = new Div();
        HorizontalLayout topButtons = new HorizontalLayout();
        topButtons.setClassName("pull-right");
        topButtons.add(registerNew, filtering);
        right.add(topButtons);

        topper.setWidth("95vw");
        topper.add(topHeadings, right);

        HorizontalLayout footer = new HorizontalLayout();
        footer.setWidth("95vw");
        footer.add(refresh, select, deselect);

        grid.setWidth("95vw");

        add(topper, grid, footer);

        clear.addClickListener(
                e -> filterText.clear()
        );
    }
}