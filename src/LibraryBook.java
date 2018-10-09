public class LibraryBook {

    State CheckedInState;
    State CheckOutState;
    State LostState;
    State ExtendedState;

    State state;

    String title;
    String author;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;

        setupStates();
    }


    private void setupStates() {
        CheckedInState = new CheckedInState(this);
        CheckOutState = new CheckedOutState(this);
        LostState = new LostState(this);
        ExtendedState = new ExtendedCheckOutState(this);

        state = CheckedInState;
    }

    public void checkOutBook() {
        state.CheckOutBook();
    }

    public void checkInBook() {
        state.CheckInBook();
    }

    public void extendCheckOut() {
        state.ExtendCheckOut();
    }

    public void loseBook() {
        state.LoseBook();
    }

    public void findBook() {
        state.FindBook();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getCheckedInState() {
        return CheckedInState;
    }

    public State getCheckOutState() {
        return CheckOutState;
    }

    public State getLostState() {
        return LostState;
    }

    public State getExtendedState() {
        return ExtendedState;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\nTitle : " + title);
        stringBuffer.append("\nAuthor : " + author);
        stringBuffer.append("\nCurrent State : " + state.toString());
        stringBuffer.append("\n");

        return stringBuffer.toString();
    }
}
