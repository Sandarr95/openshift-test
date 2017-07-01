(ns openshift-test.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [some-chan 0
        echo-token (System/getenv "TELEGRAM_BOT_TOKEN")]
  (println "Program runs")))
