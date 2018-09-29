public class TestState {

    // Main
    public static void main(String[] args) {
        LibraryBookContext context = new LibraryBookContext();

        State checkedIn = new CheckedInState();
        State checkedOut = new CheckedOutState();
        State lost = new LostState();
        State reserved = new ReservedState();

        context.setState(checkedIn);
        context.doAction();

        context.setState(checkedOut);
        context.doAction();

        context.setState(lost);
        context.doAction();

        context.setState(reserved);
        context.doAction();
    }
}
