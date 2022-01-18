from openjdk

COPY ./src/main/java/*.java /

RUN javac /Main.java /Calculator.java

ENTRYPOINT ["java", "Main"]
