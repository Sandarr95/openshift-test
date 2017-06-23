(ns openshift-test.core
  (:require [aleph.http :as http]
            [morse.api :as telegram]
            [morse.polling :as bot])
  (:gen-class))

(defn handler [req]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "Yo, it works, gj"})

(defn telegram-echoer [token]
  (fn [{{{id :id} :chat t :text :or {t "Only text"}} :message}]
    (telegram/send-text token id t)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [echo-token (System/getenv "TELEGRAM_BOT_TOKEN")]
    (bot/start echo-token (telegram-echoer echo-token))
    (http/start-server handler {:port 8080})))
