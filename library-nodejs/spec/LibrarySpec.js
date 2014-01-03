var library = require("../src/Library").library;

describe("A Library", function() {
    it("should say hello", function() {
        expect(library.sayHello()).toEqual("Hello world!");
    });
});