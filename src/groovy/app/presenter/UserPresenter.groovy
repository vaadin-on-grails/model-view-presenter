package app.presenter

import app.model.User
import app.model.UserService
import app.view.UserView
import com.vaadin.grails.Grails
import com.vaadin.ui.UI

class UserPresenter {

    public static final String USER = 'user'

    UserView view

    UserPresenter() {
    }

    UserPresenter initialize() {
        view = new UserView()
        UI.current.navigator.addView(USER, view)

        return this
    }

    void navigate() {
        UI.current.navigator.navigateTo(USER)

        UserService model = Grails.get(UserService)
        User user = model.findByEmail('john@app.com')
        view.showUserDetail(user)
    }
}
