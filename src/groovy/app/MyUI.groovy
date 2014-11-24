package app

import app.presenter.UserPresenter
import com.vaadin.navigator.Navigator
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.UI

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest r) {

        Navigator navigator = new Navigator(this, this)
        setNavigator(navigator)

        new UserPresenter().initialize().navigate()
    }
}
