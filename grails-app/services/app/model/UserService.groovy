package app.model

import grails.transaction.Transactional

@Transactional
class UserService {

    User findByEmail(String email) {
        return User.findByEmail(email)
    }
}
