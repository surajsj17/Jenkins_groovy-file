pipeline code for running sh and bat command 
Using Try , catch and IF statement

it will check first this is linux machine if yes then it will execute the sh command
other wise {else} it will run bat command or show error message

In my case i m using the my local machine [window]
######################################################################################

parallel stage build or tested on same time on same stage

real time example is -- mvn clean package | mvn sonar:sonar  [this are 2 different build command] 

#############################################################################################

How to skip the stages by choice parameter 

1 - build  ---- run
2 - test  // skip this stage
3 - deploy ------ run
