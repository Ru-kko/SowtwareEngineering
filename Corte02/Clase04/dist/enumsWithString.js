"use strict";
var PrintMedia;
(function (PrintMedia) {
    PrintMedia["NEWSLETTER"] = "Newsletter";
    PrintMedia["BOOK"] = "Book";
    PrintMedia["MAGAZINE"] = "Magazine";
    PrintMedia["NEWSPAPER"] = "NEWSPPAER";
})(PrintMedia || (PrintMedia = {}));
console.log(PrintMedia.NEWSPAPER);
console.log(PrintMedia["NEWSLETTER"]);
