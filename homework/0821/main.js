$(document).ready(function () {
    $("td:even").css("background-color", "yellow");
    $("td:odd").css("background-color", "pink");
    $(".del").click(function () {
        this.closest("tr").remove();
    });
    $(".emoji").click(function () {
        var emoji = $(this).closest("span").text();
        $("#comment").append(emoji);
    });
    $("body").on("click", "#list1 .item", function (event) {
        $(this).appendTo("#list2"); // “this” is the clicked element
    });

    $("body").on("click", "#list2 .item", function (event) {
        $(this).appendTo("#list1"); // “this” is the clicked element
    });
});
