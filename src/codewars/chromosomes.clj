(ns codewars.chromosomes)

(defn chromosome-check
  [c]
  (if (re-find #"Y" c)
    "Congratulations! You're going to have a son."
    "Congratulations! You're going to have a daughter."))
