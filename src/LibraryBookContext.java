public class LibraryBookContext implements State {

    private State bookState;

    public void setState(State state) {
        this.bookState = state;
    }

    public State getState() {
        return this.bookState;
    }

    @Override
    public void doAction() {
        this.bookState.doAction();
    }
}
