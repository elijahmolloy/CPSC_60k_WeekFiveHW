public class LostState implements State {

    LibraryBook libraryBook;

    public LostState(LibraryBook libraryBook) {
        this.libraryBook = libraryBook;
    }

    @Override
    public void CheckOutBook() {
        System.out.println("Whoops! " + libraryBook.getTitle() + " is Lost.");
    }

    @Override
    public void CheckInBook() {
        System.out.println("Whoops! " + libraryBook.getTitle() + " is Lost.");
    }

    @Override
    public void ExtendCheckOut() {
        System.out.println("Whoops! " + libraryBook.getTitle() + " is Lost.");
    }

    @Override
    public void LoseBook() {
        System.out.println("Whoops! " + libraryBook.getTitle() + " is Lost.");
    }

    @Override
    public void FindBook() {
        System.out.println("Thank you for finding " + libraryBook.getTitle() + ". It is not available for Check Out.");

        libraryBook.setState(libraryBook.getCheckedInState());
    }

    @Override
    public String toString() {
        return "Book is currently Lost (and waiting to be found)";
    }
}
