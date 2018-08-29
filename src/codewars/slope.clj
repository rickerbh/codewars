(ns codewars.slope)

(defn slope
  [[a b c d]]
  (let [denominator (- c a)]
    (if (= 0 denominator)
      "undefined"
      (str (/ (- d b) denominator)))))
