(ns codewars.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn max-rot
  [number] 
  (loop [number-str (vec (format "%s" number))
         max-number number
         iterations 0]
    (if (= iterations (count number-str))
      max-number
      (let [start (vec (take iterations number-str))
            leftover (drop iterations number-str)
            new-str (clojure.string/join "" (into start (into (vec (rest leftover)) (take 1 leftover))))
            max-candidate (BigInteger. new-str)
            new-max (max max-number max-candidate)
            new-vec (vec (format "%s" new-str))]
        (recur new-vec new-max (+ iterations 1))))))

(defn nb-year
  [p0 percent aug p]
  (loop [start-p p0
         pct-inc (/ percent 100.0)
         aug aug
         goal p
         iter 1]
    (let [new-pop (int (+ start-p (* start-p pct-inc) aug))]
      (if (<= goal new-pop)
        iter
        (recur new-pop pct-inc aug goal (+ 1 iter))))))

(defn predict-age
  [& ages] 
  (as-> ages $
    (map (fn [x] (* x x )) $)
    (apply + $)
    (Math/sqrt $)
    (int (/ $ 2))))
