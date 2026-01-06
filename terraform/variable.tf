variable "region" {
  default = "us-east-1"
}
variable "project" {
  default = "marks"
}
variable "vpc_cidr" {
  default = "10.0.0.0/16"
}
variable "private_cidr" {
  default = "10.0.0.0/24"
}
variable "public_cidr" {
  default = "10.0.1.0/24"
}
variable "environment" {
  default = "devops"
}
variable "instance_count" {
  default = "2"
}
variable "image_id" {
  default = "ami-0ecb62995f68bb549"
}
variable "key_pair" {
  default = "id_rsa"
}
variable "instance_type" {
  default = "t3.micro"
}
