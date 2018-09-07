(ns codewars.first-class-function-factory)

(defn factory
  [x]
  (partial map #(* x %)))
