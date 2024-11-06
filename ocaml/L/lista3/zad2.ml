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

let () =
  let wynik = (grupuj ["1"; "1"; "1"; "1"; "2"; "3"; "3"; "1"; "1"; "4"; "4"])  in
  let rec wypisz_wynik lst =
    if lst = [] then
      print_string "\n"
    else
      let elem = fst (List.hd lst) in
      let count = snd (List.hd lst) in
      print_string "(";
      print_string elem;
      print_string ", ";
      print_int count;
      print_string ") ";
      wypisz_wynik (List.tl lst)
  in
  wypisz_wynik wynik
