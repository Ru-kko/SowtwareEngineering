"use strict";
var PrintMedia;
(function (PrintMedia) {
    PrintMedia[PrintMedia["NewsPapper"] = 1] = "NewsPapper";
    PrintMedia[PrintMedia["Newsletter"] = getMediaCode('Newsletter')] = "Newsletter";
    PrintMedia[PrintMedia["Magazine"] = PrintMedia.Newsletter * 3] = "Magazine";
    PrintMedia[PrintMedia["Book"] = 10] = "Book";
})(PrintMedia || (PrintMedia = {}));
function getMediaCode(code) {
    if (code === 'Newsletter') {
        return 5;
    }
    return 0;
}
console.log(PrintMedia.Newsletter);
console.log(PrintMedia.Magazine);
