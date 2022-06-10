kill -9 $(lsof -t -i:8080)
echo "Killed process running on port 8080"

java -jar SpringBootSimpleDemo-0.0.1-SNAPSHOT.war
echo "Started server using java -jar command"