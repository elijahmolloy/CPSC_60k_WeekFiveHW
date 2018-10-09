public interface State {
    void CheckOutBook();
    void CheckInBook();
    void ExtendCheckOut();
    void LoseBook();
    void FindBook();
}
