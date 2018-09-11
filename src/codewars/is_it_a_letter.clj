(ns codewars.is-it-a-letter)

(defn letter?
  [s]
  (->> s
       (re-matches #"(?i)[A-Z]")
       empty?
       not))
