import sys
import os
import requests
import socket

ip = "127.0.0.1"
port = 80
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.listen(port)

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(ip, port)
response = client.recv(1024)
