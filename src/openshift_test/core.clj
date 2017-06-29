(ns openshift-test.core
  (:require [morse.api :as t]
            [morse.polling :as bot])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [echo-token (System/getenv "TELEGRAM_BOT_TOKEN")]
  (bot/start echo-token println)
  (println "Program runs")))
