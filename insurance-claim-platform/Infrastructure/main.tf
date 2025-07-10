provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "insurance_server" {
  ami           = "ami-0abcdef1234567890"
  instance_type = "t2.micro"
  tags = {
    Name = "InsuranceAppServer"
  }
}