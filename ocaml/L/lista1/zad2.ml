let rec length s = 
  if s = "" then 0
  else 1 + length (String.sub s 1 (String.length s - 1));;

let rec list_of_lengths xs = 
  if xs = [] then []
  else length (List.hd xs) :: list_of_lengths (List.tl xs);;

let rec print_lengths xs =
  if xs = [] then print_string "[]"
  else begin
    print_int (List.hd xs);
    let rest = List.tl xs in
    if rest <> [] then begin
      print_string "; ";
      print_lengths rest
    end
  end;;

let result = list_of_lengths ["To"; "jest"; "napis"];;
let length_of_ocaml = length "OCaml";;

print_string "Długość napisu \"OCaml\": ";;
print_int length_of_ocaml;;
print_newline ();;

print_string "Długości napisów w liście: [";;
print_lengths result;;
print_string "]\n";;

