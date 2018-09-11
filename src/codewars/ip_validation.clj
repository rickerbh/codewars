(ns codewars.ip-validation
  (:require [clojure.string :as s]))

(defn validate-ip
  [s]
  (if (or (empty? s)
          (not= s (s/trim s)))
    false
    (let [segments (map read-string (s/split s #"\." ))]
      (cond
        (not= 4 (count segments)) false
        (not-every? true? (map number? segments)) false
        (not-every? true? (map #(<= 0 % 255) segments)) false
        :else true))))
