(ns codewars.noboringzeros)

(defn no-boring-zeros [n]
  (if (zero? n)
    n
    (-> n
        str
        (clojure.string/replace #"0+$" "")
        Integer/parseInt)))
