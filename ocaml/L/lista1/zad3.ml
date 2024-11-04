let przesun f (a, b) =
  fun x -> f (x -. a) +. b;;

let f1 x = x;;

let przesun_f1 = przesun f1 (1.5, 2.5);;

let test1 = przesun_f1 4.5;;  
let test2 = przesun_f1 3.0;;  
let test3 = przesun_f1 1.0;;  
let test4 = przesun_f1 2.0;;  
let test5 = przesun_f1 9.0;;  

let () =
  Printf.printf "Wynik przesunięcia f1 dla x=4.5: %.2f\n" test1;
  Printf.printf "Wynik przesunięcia f1 dla x=3.0: %.2f\n" test2;
  Printf.printf "Wynik przesunięcia f1 dla x=1.0: %.2f\n" test3;
  Printf.printf "Wynik przesunięcia f1 dla x=2.0: %.2f\n" test4;
  Printf.printf "Wynik przesunięcia f1 dla x=9.0: %.2f\n" test5;