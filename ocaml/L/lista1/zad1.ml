let srednia (x1, x2, x3) =
  (x1 +. x2 +. x3) /. 3.0;;


let a1 = 1.;;
let a2 = 2.;;
let a3 = 4.;;
let result = srednia (a1, a2, a3);;

print_string "\nŚrednia to: ";;
print_float result;;

let a1 = 4.;;
let a2 = 4.;;
let a3 = 4.;;
let result = srednia (a1, a2, a3);;

print_string "\nŚrednia to: ";;
print_float result;;

let a1 = 4.;;
let a2 = 5.;;
let a3 = 1.;;
let result = srednia (a1, a2, a3);;

print_string "\nŚrednia to: ";;
print_float result;;
print_newline ()