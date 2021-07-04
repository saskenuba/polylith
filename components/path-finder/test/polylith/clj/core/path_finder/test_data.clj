(ns polylith.clj.core.path-finder.test-data
  (:require [clojure.test :refer :all]))

(def dep-entries [{:profile? false, :test? false, :lib-dep ["org.clojure/clojure" {:mvn/version "1.10.1"}]}
                  {:profile? false, :test? false, :lib-dep ["org.clojure/tools.deps.alpha" {:mvn/version "0.11.931"}]}
                  {:profile? false, :test? true, :lib-dep ["zprint" #:mvn{:version "0.4.15"}]}
                  {:profile? true, :test? false, :lib-dep ["net.mikera/core.matrix" {:mvn/version "0.62.0"}]}])

(def path-entries [{:exists?    true
                    :name       "cli"
                    :path       "bases/cli/resources"
                    :profile?   false
                    :source-dir "resources"
                    :test?      false
                    :type       :base}
                   {:exists?    true
                    :name       "cli"
                    :path       "bases/cli/src"
                    :profile?   false
                    :source-dir "src"
                    :test?      false
                    :type       :base}
                   {:exists?    true
                    :name       "address"
                    :path       "components/address/resources"
                    :profile?   false
                    :source-dir "resources"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "address"
                    :path       "components/address/src"
                    :profile?   false
                    :source-dir "src"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "database"
                    :path       "components/database/resources"
                    :profile?   false
                    :source-dir "resources"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "database"
                    :path       "components/database/src"
                    :profile?   false
                    :source-dir "src"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "invoicer"
                    :path       "components/invoicer/resources"
                    :profile?   false
                    :source-dir "resources"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "invoicer"
                    :path       "components/invoicer/src"
                    :profile?   false
                    :source-dir "src"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "purchaser"
                    :path       "components/purchaser/resources"
                    :profile?   false
                    :source-dir "resources"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "purchaser"
                    :path       "components/purchaser/src"
                    :profile?   false
                    :source-dir "src"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "user"
                    :path       "components/user/resources"
                    :profile?   false
                    :source-dir "resources"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "user"
                    :path       "components/user/src"
                    :profile?   false
                    :source-dir "src"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "development"
                    :path       "development/src"
                    :profile?   false
                    :source-dir "src"
                    :test?      false
                    :type       :project}
                   {:exists?    true
                    :name       "cli"
                    :path       "bases/cli/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :base}
                   {:exists?    true
                    :name       "address"
                    :path       "components/address/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :component}
                   {:exists?    true
                    :name       "database"
                    :path       "components/database/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :component}
                   {:exists?    true
                    :name       "invoicer"
                    :path       "components/invoicer/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :component}
                   {:exists?    true
                    :name       "purchaser"
                    :path       "components/purchaser/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :component}
                   {:exists?    true
                    :name       "user"
                    :path       "components/user/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :component}
                   {:exists?    true
                    :name       "invoice"
                    :path       "projects/invoice/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :project}
                   {:exists?    true
                    :name       "development"
                    :path       "development/test"
                    :profile?   false
                    :source-dir "test"
                    :test?      true
                    :type       :project}
                   {:exists?    true
                    :name       "user"
                    :path       "components/user/resources"
                    :profile?   true
                    :source-dir "resources"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "user"
                    :path       "components/user/src"
                    :profile?   true
                    :source-dir "src"
                    :test?      false
                    :type       :component}
                   {:exists?    true
                    :name       "user"
                    :path       "components/user/test"
                    :profile?   true
                    :source-dir "test"
                    :test?      true
                    :type       :component}])
