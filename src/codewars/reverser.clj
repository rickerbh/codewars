(ns codewars.reverser
  (:require [clojure.string :as s]))

(defn reverser
  [s]
  (as-> s $
    (s/split $ #" ")
    (map s/reverse $)
    (s/join " " $)
    (str $ (re-find (re-matcher #"\s+$" s)))))

(def solution reverser)
