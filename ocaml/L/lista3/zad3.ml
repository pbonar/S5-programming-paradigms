let grupuj lst =
  if lst = [] then
    []
  else
    let rec grupuj_elementy curr_elem count acc pozostale =
      if pozostale = [] then
        (curr_elem, count) :: acc
      else
        let y = List.hd pozostale in
        let ys = List.tl pozostale in
        if y = curr_elem then
          grupuj_elementy curr_elem (count + 1) acc ys
        else
          grupuj_elementy y 1 ((curr_elem, count) :: acc) ys
    in
    grupuj_elementy (List.hd lst) 1 [] (List.tl lst)

let unique xs =
  let result = grupuj xs in
  let rec znajdz_unique xs acc =
    match xs with
    | [] -> List.rev acc
    | (elem, 1) :: tail -> znajdz_unique tail (elem :: acc)
    | _ :: tail -> znajdz_unique tail acc
  in
  znajdz_unique result []

let () =
  let wynik = unique ["1"; "1"; "1";"1"; "2"; "3"; "3"; "1"; "1"; "a"; "4"; "4"] in
  List.iter (fun elem -> Printf.printf "%s " elem) wynik;
  print_newline ()