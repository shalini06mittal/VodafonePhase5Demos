#!/usr/bin/env bash


#https://kgaurav23.medium.com/deploying-hosting-spring-boot-applications-on-aws-ec2-7babc15a1ab6
#https://cloudkatha.com/how-to-deploy-spring-boot-application-on-aws-ec2/
#Copy execute_commands_on_ec2.sh file which has commands to be executed on server... Here we are copying this file
# every time to automate this process through 'deploy.sh' so that whenever that file changes, it's taken care of
scp -i "~/Downloads/EC2SpringBootPair.pem" execute_commands_on_ec2.sh ec2-user@ec2-3-84-51-146.compute-1.amazonaws.com:/home/ec2-user
echo "Copied latest 'execute_commands_on_ec2.sh' file from local machine to ec2 instance"

scp -i "~/Downloads/EC2SpringBootPair.pem" /Users/Shalini/Desktop/DBSTraining_Final/SpringBootSimpleDemo/target/SpringBootSimpleDemo-0.0.1-SNAPSHOT.war ec2-user@ec2-3-84-51-146.compute-1.amazonaws.com:/home/ec2-user
echo "Copied jar file from local machine to ec2 instance"

echo "Connecting to ec2 instance and starting server using java -jar command"
ssh -i "~/Downloads/EC2SpringBootPair.pem" ec2-user@ec2-3-84-51-146.compute-1.amazonaws.com sh execute_commands_on_ec2.sh