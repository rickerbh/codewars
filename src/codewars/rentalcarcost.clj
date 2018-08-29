(ns codewars.rentalcarcost)

(defn rental-car-cost
  [d]
  (let [base-cost (* d 40)]
    (if (<= 7 d)
      (- base-cost 50)
      (if (<= 3 d)
        (- base-cost 20)
        base-cost))))
