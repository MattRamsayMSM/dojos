function Library() {
    this.books = [];

    function init() {
        this.books.length = 0;
        this.books.push(new Book("Clean Code", "Robert C. Martin"));
        this.books.push(new Book("Star Wars", "George Lucas"));
        this.books.push(new Book("South Park", "Trey Parker"))
    }

    init.apply(this);
}

Library.prototype.addBook = function(title, author) {
    this.books.push(new Book(title, author));
}

Library.prototype.borrowBookWithTitle = function(title) {
    for (var i=0; i<this.books.length; i++) {
        if (this.books[i].title === title) {
            if (this.books[i].onLoan) {
                throw new Error('book is out on loan');
            }

            this.books[i].onLoan = true;
        }
    }
};