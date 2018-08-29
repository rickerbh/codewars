(ns codewars.banjo)

(defn plays-banjo?
  [name] 
  (if (= "r" (clojure.string/lower-case (subs name 0 1)))
    (str name " plays banjo")
    (str name " does not play banjo")))
