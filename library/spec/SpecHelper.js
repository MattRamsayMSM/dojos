beforeEach(function () {
    jasmine.addMatchers({
        toHaveBookOnLoan: function () {
            return {
                compare: function (actual, expected) {
                    var library = actual;

                    var book = null;
                    for (var i=0; i<library.books.length; i++) {
                        if(expected === library.books[i].title) {
                            book = library.books[i];
                        }
                    }

                    return {
                        pass: book != null && book.isOnLoan
                    }
                }
            };
        },
        toHaveBook: function() {
            return {
                compare: function (actual, expected) {
                    var library = actual;

                    var book = null;
                    for (var i=0; i<library.books.length; i++) {
                        if(expected === library.books[i].title) {
                            book = library.books[i];
                        }
                    }

                    return {
                        pass: book != null
                    }
                }
            }
        }
    });
});
