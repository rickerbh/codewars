(ns codewars.bonus)

(defn bonus-time
  [salary bonus]
  (let [result (if bonus (* 10 salary) salary)]
    (format "$%d" result)))
