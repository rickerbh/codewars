(ns codewars.template-test
  (:require [codewars.template :refer :all]
            [clojure.test :refer :all]))

(deftest TemplateTest
  (is (= ((template "{{name}} likes {{interests}}") {:name "John" :interests "dogs"})
         "John likes dogs")))
