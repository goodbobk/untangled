(defproject calendar-demo "0.1.0-SNAPSHOT"
  :description "A demo of making a calendar component with quiescent-model"
  :url ""
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3297"]
                 [quiescent "0.2.0-RC1"]
                 ;[quiescent-model "0.1.0-SNAPSHOT"]
                 ]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-figwheel "0.3.5"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]

              :figwheel { :on-jsload "calendar-demo.core/on-js-reload" }

              :compiler {:main calendar-demo.core
                         :asset-path "js/compiled/out"
                         :output-to "resources/public/js/compiled/calendar-demo.js"
                         :output-dir "resources/public/js/compiled/out"
                         :source-map-timestamp true }}
             ]}

  :figwheel {
             :css-dirs ["resources/public/css"] 
             :nrepl-port 7888
             })
