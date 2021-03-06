public class CheckedOutState implements State {

    LibraryBook libraryBook;

    public CheckedOutState(LibraryBook libraryBook) {
        this.libraryBook = libraryBook;
    }

    @Override
    public void CheckOutBook() {
        System.out.println("Whoops! " + libraryBook.getTitle() + " is already Check Out!");
    }

    @Override
    public void CheckInBook() {
        System.out.println("Thank you, " + libraryBook.getTitle() + " is now Checked In.");

        libraryBook.setState(libraryBook.getCheckedInState());
    }

    @Override
    public void ExtendCheckOut() {
        System.out.println("Thank you, " + libraryBook.getTitle() + "'s due date is now Extended.");

        libraryBook.setState(libraryBook.getExtendedState());
    }

    @Override
    public void LoseBook() {
        System.out.println("Thank you for the update, " + libraryBook.getTitle() + " is updated to Lost.");

        libraryBook.setState(libraryBook.getLostState());
    }

    @Override
    public void FindBook() {
        System.out.println("Whoops!" + libraryBook.getTitle() + " is not Lost!");
    }

    @Override
    public String toString() {
        return "Book is currently Checked Out (and waiting to be Checked In)";
    }
}
