import app.model.User

class BootStrap {

    def init = { servletContext ->

        User john = new User()
        john.firstname = 'John'
        john.surname = 'Lustig'
        john.email = 'john@app.com'
        john.save()

    }
    def destroy = {
    }
}
