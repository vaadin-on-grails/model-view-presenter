package app.presenter

import com.vaadin.navigator.Navigator
import com.vaadin.ui.UI

class UiPresenter {

    private UserPresenter userPresenter = new UserPresenter()

    UiPresenter initialize() {
        UI ui = UI.current

        Navigator navigator = new Navigator(ui, ui)
        ui.navigator = navigator

        userPresenter.initialize()

        return this
    }

    UiPresenter navigateToUserView() {
//        userPresenter.navigateTo()

        return this
    }
}
