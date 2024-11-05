let rec obetnij_krance_rec xs =
  if xs = [] || List.length xs < 2 then
    []
  else
    List.hd xs :: obetnij_krance_rec (List.tl xs)

let obetnij_krance xs =
  if xs = [] || List.length xs <= 1 then
    []
  else
    obetnij_krance_rec (List.tl xs)

let () =
  let lst = [5; 4; 3; 2] in
  let wynik = obetnij_krance lst in
  List.iter (Printf.printf "%d ") wynik;
  print_newline ()
