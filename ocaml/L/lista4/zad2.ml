let rec podziel_non_tailrec list =
  match list with
  | [] -> ([], [])
  | [x] -> ([], [x])
  | x :: y :: tail ->
    let even, odd = podziel_non_tailrec tail in
    (y :: even, x :: odd)

