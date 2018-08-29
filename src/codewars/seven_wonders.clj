(ns codewars.seven-wonders)

(defn seven-wonders-science
  [compasses gears tablets]
  (let [step1-score (* 7 (min compasses gears tablets))
        step2-score (apply + (map #(* % %) [compasses gears tablets]))]
    (+ step1-score step2-score)))
