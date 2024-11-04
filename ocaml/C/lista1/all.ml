let rec flatten (xss) = (
    if (xss = [])
      then []
    else
      List.hd xss @ flatten (List.tl xss)
);;

let rec count(x, xs) = (
    if (xs = []) 
      then 0
    else if (x = List.hd xs) 
      then 1 + count(x, List.tl xs)
    else count(x, List.tl xs)
);;

let rec replicate (x, n) = (
    if (n<=0) then []
    else [x] @ replicate(x, n-1)
);;

let rec sqrList xs = (
    if xs = [] then []
    else [(List.hd xs * List.hd xs)] @ sqrList (List.tl xs) 
);;

let rec palindrome (xs) = (
    let xs_r = List.rev xs in xs = xs_r
);;

let rec listLength(xs) = (
    if (xs = []) then 0
    else 1+listLength(List.tl xs)
);;