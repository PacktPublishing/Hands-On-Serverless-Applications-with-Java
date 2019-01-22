aws s3 mb s3://spring-boot-lambda-demo-bucket
aws cloudformation package --template-file sam.yaml --output-template-file target/output-sam.yaml --s3-bucket spring-boot-lambda-demo-bucket
aws cloudformation deploy --template-file target/output-sam.yaml --stack-name spring-boot-lambda --capabilities CAPABILITY_IAM
aws cloudformation describe-stacks --stack-name spring-boot-lambda
aws lambda list-functions
aws lambda update-function-code --function-name spring-boot-lambda-LambdaSpringBootFunction-168VMOF3Z80A3 --zip-file fileb://target/spring-functions-0.0.1-SNAPSHOT-aws.jar


GET Books
curl https://o5dyn5u94c.execute-api.us-east-1.amazonaws.com/Prod/books

CREATE Book
curl -X POST https://o5dyn5u94c.execute-api.us-east-1.amazonaws.com/Stage/books  -H 'Content-Type: application/json' -d '{ "isbn":"0982-AWSD-SW12", "title":"Spring Functions" }'
