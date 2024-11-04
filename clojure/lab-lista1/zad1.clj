(defn average [numbers]
  (if (empty? numbers)
    0
    (/ (reduce + numbers) (count numbers))))

(average [3.0 5.0 7.0])
(average [4 5 6])
(average [8 9 13])
(average [1 2 4])
(average [1 4 5])