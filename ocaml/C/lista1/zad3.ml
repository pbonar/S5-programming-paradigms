let rec replicate (x, n) = (
    if (n<=0) then []
    else [x] @ replicate(x, n-1)
);;

let result = replicate (1,3);;
List.iter (fun x -> print_int x; print_string " ") result;;