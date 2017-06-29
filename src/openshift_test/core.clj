(ns openshift-test.core
  (:require [clojure.core.async :refer [chan go go-loop thread >! <! close! alts!]])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [echo-token (System/getenv "TELEGRAM_BOT_TOKEN")]
  (println "Program runs")))
