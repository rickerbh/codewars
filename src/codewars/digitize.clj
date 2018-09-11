(ns codewars.digitize
  (:require [clojure.string :as s]))

(defn digitize
  [n]
  (as-> n $
    (str $)
    (s/split $ #"")
    (map read-string $)))
