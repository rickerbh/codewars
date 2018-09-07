(ns codewars.accumulate
  (:require [clojure.string :as s]))

;; Should have used map-indexed
(defn accum
  [s]
  (->> (partition 2 (interleave s (range 1 (inc (count s)))))
       (map #(repeat (second %) (first %)))
       (map #(s/capitalize (apply str %)))
       (s/join "-")))

