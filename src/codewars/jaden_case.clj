(ns codewars.jaden-case
  (:require [clojure.string :as s]))

(defn jaden-case [s]
  (as-> s $
    (s/split $ #" ")
    (map s/capitalize $)
    (s/join " " $)))
