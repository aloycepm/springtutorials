package com.tutorials.spring.repository;

import com.tutorials.spring.ui.NoItemsView;
import com.tutorials.spring.model.Student;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

    @Route("student/page")
    class StudentHome extends Div implements BeforeEnterObserver {
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
}
