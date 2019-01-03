This project is an example of how to integrate a spring boot aplication with Docker Stack(docker + docker compose + docker swarm)

SOME TIPS to remember
---------------------

NGINX
https://coderwall.com/p/dgwwuq/installing-nginx-in-mac-os-x-maverick-with-homebrew
http://nginx.org/en/docs/http/load_balancing.html
Port configurado 8091
sudo docker-compose up --build
docker ps
curl http://localhost:8080/micro-service
docker-compose ps
docker-compose scale backend2=5

//despliega
docker-machine ls

//inicia
docker-machine start myvm1
docker swarm init
docker-machine ssh myvm1 "docker swarm init --advertise-addr 192.168.99.100:2377"
docker swarm join --token SWMTKN-1-5gak62rxi4d376ua43am343q0hiwqlwpvpjfh5a888hqgigvk8-dp717vo0ditknl7irrn0zoi8z 192.168.99.100:2377

//se une a uno creado
docker-machine ssh myvm2 "docker swarm join --token SWMTKN-1-5gak62rxi4d376ua43am343q0hiwqlwpvpjfh5a888hqgigvk8-dp717vo0ditknl7irrn0zoi8z 192.168.99.100:2377"

//despliega
docker-machine ssh myvm1 "docker node ls"
//libera
docker-machine ssh myvm2 "docker swarm leave" --force

//copia
docker-machine scp docker-compose.yml myvm1:~
//deploya
docker-machine ssh myvm1 "docker stack deploy -c docker-compose.yml backend"

docker login —username=mtapia79
docker tag studentservices/backend:latest  mtapia79/studentservices:latest
docker push mtapia79/studentservices:latest

docker tag studentservices_loadbalancer:latest  mtapia79/loadbalancer:latest
docker push mtapia79/loadbalancer:latest
