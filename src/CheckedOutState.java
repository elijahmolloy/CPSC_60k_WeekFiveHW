public class CheckedOutState implements State {

    @Override
    public void doAction() {
        System.out.println("Book State : Checked Out");
    }
}
