gpg
gpg --full-generate-key
gpg --list-keys
gpg --export --armor KEYSTOBEUPLOADED

mvn versions:set -DnewVesions
mvn clean install
mvn javadoc:jar source:jar
cd verify/src/main/java/com/github/uzrnem/verify
gpg -ab All.java
mvn clean deploy

cd target
target$ gpg -ab verify-0.0.1-SNAPSHOT-javadoc.jar
target$ gpg -ab verify-0.0.1-SNAPSHOT.jar
$ gpg -ab pom.xml

mvn deploy
mvn clean deploy -P release

git push origin
mvn release:perform
mvn nexus-staging:release


mvn javadoc:jar source:jar repository:bundle-create
https://oss.sonatype.org/#staging-upload





mvn versions:set
mvn clean install
mvn javadoc:jar source:jar
cd src/main/java/com/github/uzrnem/verify
gpg -ab Check.java
cd ../../../../../../../
cd target/
gpg -ab all.jar
gpg -ab pom.xml
git push origin
//try mvn deploy if fails
mvn clean deploy -P release
mvn release:perform
mvn nexus-staging:release
