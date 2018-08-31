(ns codewars.rainfall
  (:require [clojure.edn :as edn]
            [clojure.string :as s]))

(defn town-name
  [row]
  (-> row
      (s/split #":")
      first
      s/trim))

(defn calc-mean
  [data]
  (/ (reduce + data) (count data)))

(defn standard-deviation
  [data]
  (let [sum-of-squares (->> data
                            (map #(- % (calc-mean data)))
                            (map #(* % %))
                            (reduce +))]
    (/ sum-of-squares (count data))))

(defn parse-row
  [row]
  (let [town (town-name row)
        row-vec (edn/read-string (str "[" row "]"))
        rain-data (filter float? row-vec)]
    {:town town
     :mean (calc-mean rain-data)
     :standard-deviation (standard-deviation rain-data)}))

(defn town-data
  [twn strng]
  (let [data (map parse-row (s/split-lines strng))]
    (first (filter #(= twn (:town %)) data))))

(defn result-or-default
  [result]
  (if result
    result
    -1.0))

(defn mean
  [twn strng]
  (result-or-default (:mean (town-data twn strng))))

(defn variance
  [twn strng] 
  (result-or-default (:standard-deviation (town-data twn strng))))
