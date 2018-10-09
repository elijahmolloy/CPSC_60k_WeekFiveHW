public class TestState {

    public static void main(String[] args) {

        LibraryBook warAndPeace = new LibraryBook("War and Peace", "Leo Tolstoy");

        System.out.println(warAndPeace.toString());

        warAndPeace.checkOutBook();
        warAndPeace.checkOutBook();
        warAndPeace.extendCheckOut();
        warAndPeace.extendCheckOut();
        warAndPeace.checkInBook();
        warAndPeace.checkOutBook();
        warAndPeace.loseBook();
        warAndPeace.findBook();

        System.out.println(warAndPeace.toString());
    }
}
