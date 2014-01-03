function Book(title, author) {

    this.title = title;
    this.author = author;
    this.onLoan = false;

    this.isOnLoan = function() {
        return this.onLoan;
    }
}