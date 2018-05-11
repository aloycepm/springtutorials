package com.tutorials.spring.ui;

import com.tutorials.spring.model.Student;
import com.tutorials.spring.repository.StudentRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.web.servlet.view.RedirectView;


@HtmlImport("styles/shared-styles.html")
@Route("student/home")
public class StudentUI extends VerticalLayout {

    private Span header1 = new Span("Students Register");
    private Span header2 = new Span("Student registration system.");
    StudentTextField firstName
            = new StudentTextField("First Name");
    private TextField filterText = new TextField();
    private Button registerNew = new Button("Register New");
    private Button clear = new Button(new Icon(VaadinIcons.CLOSE_CIRCLE));
    private Button select = new Button("Select All");
    private Button deselect = new Button("Deselect All");
    private Button refresh = new Button("Refresh");
    private Grid<Student> grid = new Grid<>(Student.class);
    private StudentRepository students;

    public StudentUI() {
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
        footer.add(refresh, select, deselect, firstName);

        grid.setWidth("95vw");

        add(topper, grid, footer);

        clear.addClickListener(
                e -> filterText.clear()
        );
        registerNew.addClickListener(
                e -> {
                    registerNew.getUI()
                            .ifPresent(
                                    ui -> ui.navigate("student/register"
                                    )
                            );
                }
        );
        listStudents();

    }

    private void listStudents(){

    }
}

