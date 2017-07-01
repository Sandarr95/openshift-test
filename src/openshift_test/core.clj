(ns openshift-test.core
  (:require [clojure.core.async :as a])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [some-chan (atom 0)
        echo-token (System/getenv "TELEGRAM_BOT_TOKEN")]
  (println "Program runs")))
