(ns codewars.partlist-test
  (:require  [clojure.test :refer :all]
             [codewars.partlist :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "partlist" 
    (test-assert (partlist ["I", "wish", "I", "hadn't", "come"]),
                 '[("I", "wish I hadn't come"), ("I wish", "I hadn't come"), ("I wish I", "hadn't come"), ("I wish I hadn't", "come")])
    (test-assert (partlist ["cdIw", "tzIy", "xDu", "rThG"]),
                 '[("cdIw", "tzIy xDu rThG"), ("cdIw tzIy", "xDu rThG"), ("cdIw tzIy xDu", "rThG")])
    (test-assert (partlist ["vJQ", "anj", "mQDq", "sOZ"]),
                 '[("vJQ", "anj mQDq sOZ"), ("vJQ anj", "mQDq sOZ"), ("vJQ anj mQDq", "sOZ")])
    ))
