(ns codewars.sort-the-inner-content)

(defn sort-inner
  [word]
  (let [start (first word)
        end (last word)
        middle (take (- (count word) 2) (drop 1 word))
        sorted-middle (reverse (sort middle))]
    (clojure.string/join "" (flatten [start sorted-middle end]))))

(defn sort-the-inner-content
  [words]
  (let [splitted (clojure.string/split words #"\s")
        very-end-spaces (re-find #"\s+$" words)
        result (map #(clojure.string/join "" %) (map #(if (< 3 (count %)) (sort-inner %) %) splitted))]
    (clojure.string/join "" [(clojure.string/join " " result) very-end-spaces])))
