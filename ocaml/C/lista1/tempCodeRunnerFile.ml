let rec listLength(xs) = (
    if (xs = []) then 0
    else 1+listLength(List.tl xs)
);;

let example = [1; 2; 4; 3];;
let result = listLength example;;
print_int result;;