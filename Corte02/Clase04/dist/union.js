"use strict";
let code;
code = 111;
code = "AAA";
function func(world) {
    if (typeof world === "string")
        console.log("Hello, String");
    else if (typeof world === "number")
        console.log("Hello, number");
}
func(40);
func("1000");
func(false);
