let rec palindrome (xs) = (
    let xs_r = List.rev xs in xs = xs_r
);;

let example = [1; 2; 1];;
let result = palindrome example;;
print_endline (string_of_bool result);;