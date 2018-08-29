(ns codewars.string-repeat)

(defn repeat-str
  [number str]
  (->> str
       (repeat number)
       (clojure.string/join "")))
