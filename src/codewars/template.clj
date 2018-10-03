(ns codewars.template
  (:require [clojure.string :as s]))

(defn replace-text
  [template [key value]]
  (s/replace template (str "{{" (name key) "}}") value))

(defn template
  [str]
  (fn [replacements]
    (s/replace (reduce replace-text str replacements) #"\{\{.*?\}\}" "")))
