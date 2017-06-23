(defproject openshift-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [morse "0.2.4"]
                 [aleph "0.4.3"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler openshift-test.core/handler :port 8080}
  :main ^:skip-aot openshift-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
