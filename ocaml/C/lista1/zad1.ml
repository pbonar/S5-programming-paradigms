let rec flatten (xss) = (
    if (xss = [])
      then []
    else
      List.hd xss @ flatten (List.tl xss)
);;

let example = [[1; 2]; [3; 4]; [5]];;
let result = flatten example;;
List.iter (fun x -> print_int x; print_string " ") result;;
print_newline ();;