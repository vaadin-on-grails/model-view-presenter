package app.view

import app.model.User
import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout

class UserView extends VerticalLayout implements View {

    UserView() {
        setMargin(true)
    }

    @Override
    void enter(ViewChangeListener.ViewChangeEvent event) {
    }

    void showUserDetail(User user) {
        addComponent(new Label(user.firstname))
        addComponent(new Label(user.surname))
    }
}
