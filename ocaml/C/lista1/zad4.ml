
let rec sqrList xs = 
  if xs = [] then []
  else [(List.hd xs * List.hd xs)] @ sqrList (List.tl xs) 

let example = [1; 2; 3; 4; 5];;
let result = sqrList example;;
List.iter (fun x -> print_int x; print_string " ") result;;
print_newline ();;
