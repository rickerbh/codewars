(ns codewars.is-kiss
  (:require [clojure.string :as s]))

(defn kiss?
  [s]
  (let [arr (s/split s #" ")
        complex? (->> arr
                      (map count)
                      (map #(> % (count arr)))
                      (some true?))]
    (if complex?
      "Keep It Simple Stupid"
      "Good work Joe!")))

(def solution kiss?)
