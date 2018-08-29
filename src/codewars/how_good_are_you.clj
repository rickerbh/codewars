(ns codewars.how-good-are-you)

(defn better_than_average
  [scores my-score]
  (< (/ (apply + scores) (count scores)) my-score))
