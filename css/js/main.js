$( document ).ready(function() {

    $("a.exerciseHeader").click(function (e) {
        e.preventDefault();
        $(this).parent().next().toggle();
    });


});