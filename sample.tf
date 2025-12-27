terraform {
  backend "s3" {
    bucket = "batch151234"
    region = "us-east-1"
    key = "tfstate"
  }
}
provider "aws" {
  region = "us-east-1"
}
resource "aws_instance" "myinstance" {
  ami = var.ami_id
  instance_type = var.instance_type
  vpc_security_group_ids = ["sg-0f7b2e9cf35734448"]
  key_name = var.key_name
  availability_zone = "us-east-1a"
  tags = {
    name = "myinstance1"
  }
} 

variable "ami_id" {
  default = "ami-0c398cb65a93047f2"
}
variable "instance_type" {
  default = "t3.micro"
}
variable "key_name" {
  default = "id_rsa"
}

output "instance_id" {
  value = "aws_instance.myinstance.public_ip"
}
output "instance_id" {
  value = aws_instance.myinstance.id
}