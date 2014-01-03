describe("A Library", function() {
    var library;

    beforeEach(function() {
        library = new Library();
    });

    it("should borrow a book", function() {
        library.borrowBookWithTitle("Clean Code");
        expect(library).toHaveBookOnLoan("Clean Code");
    });

    it("should add a book", function() {
        library.addBook("Sherlock Holmes", "Arthur C. Doyle");
        expect(library).toHaveBook("Sherlock Holmes");
    });
});

