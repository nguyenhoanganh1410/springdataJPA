FROM maven:latest
RUN mkdir /qlcb
WORKDIR /qlcb
COPY . .
EXPOSE 8080
CMD ["mvn", "spring-boot:run"]