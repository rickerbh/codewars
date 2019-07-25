(ns codewars.spin-words
  (:require [clojure.string :as str]))

(defn spin-words
  [strng]
  (as-> strng $
    (str/split $ #" ")
    (map #(if (> (count %) 4) (reverse %) %) $)
    (map #(apply str %) $)
    (str/join " " $)))
