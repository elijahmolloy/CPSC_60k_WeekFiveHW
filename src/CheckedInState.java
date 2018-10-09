public class CheckedInState implements State {

    LibraryBook libraryBook;

    public CheckedInState(LibraryBook libraryBook) {
        this.libraryBook = libraryBook;
    }

    @Override
    public void CheckOutBook() {
        System.out.println("Thank you! " + libraryBook.getTitle() + " is now Checked Out");

        libraryBook.setState(libraryBook.getCheckOutState());
    }

    @Override
    public void CheckInBook() {
        System.out.println("Whoops! This book is already Checked In!");
    }

    @Override
    public void ExtendCheckOut() {
        System.out.println("Whoops! " + libraryBook.getTitle() +  " is not Checked Out!");
    }

    @Override
    public void LoseBook() {
        System.out.println("Thank you, we hope staff can locate " + libraryBook.getTitle() + " soon.");

        libraryBook.setState(libraryBook.getLostState());
    }

    @Override
    public void FindBook() {
        System.out.println("Whoops! " + libraryBook.getTitle() + " is Checked In! There is no need to Process this book.");
    }

    @Override
    public String toString() {
        return "Book is currently Checked In (and waiting to be Checked Out)";
    }
}
