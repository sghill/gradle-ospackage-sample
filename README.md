gradle-ospackage-sample
=======================

Sample project easing reproducing issues in [ospackage][ospackage].

What
----

Sets up some reasonable defaults to save time:

* 1 contrived class to ensure compilation happens
* 1 dependency to ensure dependency resolution happens
* gradle wrapper included
* `ospackage` defined with expected defaults - `version` and `release` and
  copies resulting jar and dependencies to a specific folder

How
---

Fork the repo and update `ospackage` to reproduce the problem. Link to the fork
in an issue created on [nebula-plugins/ospackage][ospackage].

Ensure you're pinning to the correct version of gradle and ospackage. This is
generally the latest release of each.

Building
--------

    $ ./gradlew buildDeb buildRpm

    $ ls -la build/distributions
    drwxr-xr-x  5 sghill  staff      170 Dec 28 08:32 .
    drwxr-xr-x  8 sghill  staff      272 Dec 28 08:38 ..
    -rw-r--r--  1 sghill  staff  2166179 Dec 28 08:38 gradle-ospackage-sample-0.1.0-1.noarch.rpm
    -rw-r--r--  1 sghill  staff      663 Dec 28 08:38 gradle-ospackage-sample_0.1.0-1_all.changes
    -rw-r--r--  1 sghill  staff  2163984 Dec 28 08:38 gradle-ospackage-sample_0.1.0-1_all.deb


[ospackage]: https://github.com/nebula-plugins/gradle-ospackage-plugin

