public abstract class User {

    protected String email;
    User ( String email ) {
        setEmail( email );
    }

    //abstract key work set the method as required if not, it doesn't need to be implemented
    abstract void showData();
    protected String  getEmail() {
        return email;
    }

    protected void setEmail( String email ) {
        this.email = email;
    }
}
