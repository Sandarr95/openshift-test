(ns openshift-test.core-test
  (:require [clojure.test :refer :all]
            [openshift-test.core :refer :all]))

(deftest a-test
  (testing "Succeeds always"
    (is (= 1 1))))
