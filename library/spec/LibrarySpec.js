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

    describe("when a book has been borrowed", function() {

        beforeEach(function() {
            library.borrowBookWithTitle("Clean Code");
        });

        it("it should throw an exception if book is already on loan", function(){
            expect(function() {
                library.borrowBookWithTitle("Clean Code");
            }).toThrowError("book is out on loan");
        });
    });
});

