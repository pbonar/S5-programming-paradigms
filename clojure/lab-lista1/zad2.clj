(defn dlugosc [s]
  (if (empty? s)
    0
    (+ 1 (dlugosc (subs s 1)))))

(defn polacz [lst]
  (if (empty? lst)
    []
    (cons (dlugosc (first lst)) (polacz (rest lst)))))

(polacz ["To" "jest" "napis"])
;; wynik: (2 4 5)

(polacz [])
;; wynik: ()

(polacz ["Cześć"])
;; wynik: (5)

