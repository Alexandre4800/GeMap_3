#!/usr/bin/env sh

##############################################################################
## Gradle start up script for UN*X
##############################################################################

DIR="$(cd "$(dirname "$0")" && pwd)"

GRADLE_WRAPPER_JAR="$DIR/gradle/wrapper/gradle-wrapper.jar"

JAVA_CMD="java"

exec "$JAVA_CMD" -jar "$GRADLE_WRAPPER_JAR" "$@"
