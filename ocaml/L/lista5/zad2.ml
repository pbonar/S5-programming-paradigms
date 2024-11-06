let zamien list n =
  let rec podziel listt count acc =
    if count = 0 then (List.rev acc, listt)
    else if listt = [] then (List.rev acc, [])
    else podziel (List.tl listt) (count - 1) (List.hd listt :: acc)
  in
  let (left, right) = podziel list n [] in
  right @ left

let () = 
  let wynik = zamien ["1"; "1"; "1"; "1"; "2"; "3"; "3"; "1"; "1"; "4"; "4"] 4 in
  List.iter (fun elem -> Printf.printf "%s " elem) wynik;
  print_newline ();
  let wynik = zamien ["1"; "1"; "4"; "4"] 2 in
  List.iter (fun elem -> Printf.printf "%s " elem) wynik;
  print_newline ();
  let wynik = zamien ["2"; "3"; "3"; "1"; "1"; "4"; "4"] 1 in
  List.iter (fun elem -> Printf.printf "%s " elem) wynik;
  print_newline ();
