(defproject opt "1.0.6-SNAPSHOT"
  :description "Purple optimization library."
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "2.1.0"]
                 ;; kludge to pull in json java classes
                 ;; can be removed after we port purpleOpt over to clojure
                 [com.twilio.sdk/twilio-java-sdk "4.2.0"]
                 [common "2.0.2-SNAPSHOT"]
                 [org.clojure/data.json "0.2.6"]]
  :java-source-paths ["src/java"])
